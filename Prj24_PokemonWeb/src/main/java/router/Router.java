package router;

import java.io.IOException;

import org.json.JSONArray;

import database.PokemonDAO;
import database.PokemonDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (value = {"/", "/home", "/indice"})
public class Router extends HttpServlet {
	
	private PokemonDAO dao;
	
	public Router() {
		System.out.println("Oggetto router costruito");
		this.dao = new PokemonDaoImpl();
}
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	JSONArray array = new JSONArray(this.dao.getPokemons());
	resp.setContentType("application/json");
	
	resp.getWriter().print(array.toString());
	System.out.println("Chiamata via get");
	
}
}
