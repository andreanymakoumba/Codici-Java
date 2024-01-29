package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Impiegato;

public class LibroMatricola {
	
	private String nomeAzienda;
	private ArrayList<Dipendente> dipendenti;
	
	
	public LibroMatricola(String nomeAzienda) {
		
		this.nomeAzienda = nomeAzienda;
		this.dipendenti = new ArrayList<>();
	}
	
	public void addDipendente(Dipendente d) {
		this.dipendenti.add(d);
	}
	
	
public void addDipendente(String nome, String cognome) {
	Dipendente d = new Dipendente(nome, cognome);
	this.addDipendente(d);
}


/**
 * @param nome
 * @param cognome
 * @param ruolo
 */
public void addDipendente(String nome, String cognome, String ruolo) {
	
	Dipendente d = null;
	
	switch (ruolo) {
	case "Impiegato":
		d = new Impiegato(nome, cognome);
		break;
		
	case "Fattorino":
		d = new Impiegato(nome, cognome);
		break;
		
	case "Magaziniere":
		d = new Impiegato(nome, cognome);
		break;
		
		default:
			System.out.println("ruolo innesistente");
			break;
	}
	
	if (d != null) {
		this.addDipendente(d);
	}
	
}

@Override
public String toString() {
	return "LibroMatricola [nomeAzienda=" + nomeAzienda + ", dipendenti=" + dipendenti + "]";
}

public String getNomeAzienda() {
	return nomeAzienda.toUpperCase();
}

public ArrayList<Dipendente> getDipendenti() {
	return dipendenti;
}


}
