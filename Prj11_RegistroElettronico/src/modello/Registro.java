package modello;

import java.util.ArrayList;

public class Registro {
	
	private String nomeCorso;
	
	//elenco è di tipo ArrayList di Studente
	private ArrayList<Studente> studenti;
	
	 /**
	  * costruttore del registro dei corsi
	  * @param nomeCorso Inserire il nome del corso
	  */
	
	
//metodo Costruttore del registro
	public Registro(String nomeCorso) {
		super();
		this.nomeCorso = nomeCorso;
		this.studenti = new ArrayList<Studente>();
	} 
	
	public String getNomeCorso() {
	return nomeCorso;
}
	//metodo getter dei Studenti
	public ArrayList<Studente> getAllStudents(){
		return this.studenti;
	}
	
	//metodo getter per avere l'Id dello studente
	public Studente getStudenteById(int id) {
		return this.studenti.get(id);
	}
	
	public Studente getStudenteByNumeroMatricola(int nMat) {
		for (Studente studente : studenti) {
			if(studente.getnMat() == nMat) {
				return studente;
			}
		}
		return null;
	}
	
	public void aggiungiStudente(Studente s) {
		this.studenti.add(s);
	}
	
	
}
