package router;

import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

import org.json.JSONArray;

import database.PokemonDAO;
import database.PokemonDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pokemon;

@WebServlet (value = {"/pokemon"})
public class PokemonMVC extends HttpServlet {
	
	private PokemonDAO dao;
	
	public PokemonMVC() {
		System.out.println("Oggetto router costruito");
		this.dao = new PokemonDaoImpl();
}
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//JSONArray array = new JSONArray(this.dao.getPokemons());
	//resp.setContentType("application/json");

	//resp.getWriter().print(array.toString());
	System.out.println("Chiamata via get");
	
	if(req.getParameter("tipo")!= null) {
		req.setAttribute("elenco", this.dao.getPokemonsByType(req.getParameter("tipo")));
	}
	else {
		req.setAttribute("elenco", this.dao.getPokemons());// add attribute alla re della pag.
	}
	
	//per togliere i dupplicati
	TreeSet<String> tipi = new TreeSet();
	
	for (Pokemon p : this.dao.getPokemons()) {
		String s = p.getTipo();
		tipi.add(s);
	}
	
	req.setAttribute("tipi", tipi);
	req.getRequestDispatcher("index.jsp").forward(req, resp);
	
	
}
}
