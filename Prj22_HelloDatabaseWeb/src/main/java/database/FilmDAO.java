package database;

import java.util.ArrayList;

import model.Film;

public interface FilmDAO {
	
	/*questi valori sono final e i metodi sono per definizione public 
	 e abstrack. Si chiama anche PPC (programmazione per contratto) 
	 
	 */
	
	String ADD = "INSERT int film() values()";
	String DELETE = "DELETE from film where id = ?";
	String GET_ALL = "select * from film";
	String GET_BY_ID = "select * from film where id = ?";
	String GET_BY_YEAR = "slect * from film wher anno = ?";
	
	
	void addFilm(Film f);
	void updateFilm(Film f);
	void deleteFilm(Film f);
	
	Film getFilmById(int id);
	ArrayList<Film> getFilms();
	ArrayList<Film> getFilmsByAnno(int anno);
	
	

}
