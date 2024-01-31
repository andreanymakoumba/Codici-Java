package view;

import java.io.File;
import java.util.ArrayList;

import controller.Libreria;
import model.Libro;
import util.LeggiScriviFile;

public class App {
	public static void main(String[] args) {
		Libreria libRagazzi = new Libreria("libri per ragazzi");
		
		/** Libro l = new Libro("I promessi sposi", "Allessandro MAnzoni");
		
		libRagazzi.addLibro(l);
		System.out.println(libRagazzi);
		
		l.setCollocazione("Autori simpa");
		libRagazzi.updateLibro(l);
		
		//libRagazzi.deleteLibro(l);
		
		System.out.println(libRagazzi); */
		
		File sorgente = new File ("Z:\\biblioteca2.csv");
		File destinazione = new File("\"Z:\\biblioteca.html\"");
		ArrayList<String> lettura = LeggiScriviFile.leggi(sorgente);
		
		for (String string : lettura) {
			System.out.println(string);
			
			String[] parole = string.split(";");
			
			String autore = parole[0];
			String titolo = parole[1];
			
		}
		
		
	}

}
