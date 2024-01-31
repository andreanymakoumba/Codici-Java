package controller;

import java.util.ArrayList;

import model.Libro;



public class Libreria {
	
	private ArrayList<Libro> libri;
	private String nome;
	
	
	public Libreria(String nome) {
	
		this.nome = nome;
		this.libri = new ArrayList<Libro>();
		
	}
	
	//CRUD
	
	public void addLibro(Libro l) {
		
		this.libri.add(l);
	}

	//READ
	
	public ArrayList<Libro> getLibri(){
		return this.libri;
	}
	
	//UPDATE
	
public void updateLibro(Libro l) {
		//1) trovare pos iniziale libro
	int pos = this.libri.indexOf(l);
	
	//2)sostituire Libro alla posizione pos
		this.libri.add(pos, l);
	}

//DELETE

public void deleteLibro (Libro l) {
	this.libri.remove(l);
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

@Override
public String toString() {
	
	StringBuilder output = new StringBuilder();
	output.append("<ul>");
	output.append("\n");
	
	for (Libro libro : libri) {
		output.append(libro);
		output.append("\n");
		
	}
	output.append("</ul>");
	
	return output.toString();
}


}
