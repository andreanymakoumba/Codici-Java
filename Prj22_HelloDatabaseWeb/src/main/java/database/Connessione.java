package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private  final String DB_NAME = "java";
	private  final String HOST = "jdbc:mysql://localhost:3306/"+DB_NAME;
	private  final String USER = "app_tss";
	private  final String PASS = "tss_2024!";
	
	private Connection conn = null;
	
	public Connection getConn() {
		return conn;
	}
	
	public void connetti() {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.conn = DriverManager.getConnection(HOST, USER, PASS);
		System.out.println("siamo connessi!!!!");
		
	} 
	
	catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		
	System.err.println("ERRORE NELLE CONNESIONE AL DATABASE");
	System.err.println(e.getMessage());
	
		e.printStackTrace();
	}	
		
	}

}
