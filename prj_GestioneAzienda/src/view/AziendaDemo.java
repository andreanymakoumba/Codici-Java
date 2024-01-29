package view;

import controller.LibroMatricola;
import model.Dipendente;
import model.Fattorino;
import model.Impiegato;
import model.Magaziniere;

public class AziendaDemo {

	public static void main(String[] args) {
		
		LibroMatricola libro1 = new LibroMatricola("apple");
		LibroMatricola libro2 = new LibroMatricola("samsung");
		
		libro1.addDipendente("Best", "Mak", "Impiegato");
		libro1.addDipendente("Albert", "Mak", "Fattorino");
		libro1.addDipendente("Almo", "Mak", "Magaziniere");
		
		System.out.println(libro1.getNomeAzienda());
		System.out.println("Dipendenti");
		
		for(Dipendente d : libro1.getDipendenti()) {
			System.out.println(d);
		}
		System.out.println(libro2.getNomeAzienda());
		
//		Dipendente  d = new Dipendente ("Best", "Mak");
//		
//		Fattorino f = new Fattorino("Albert", "Mak");
//		f.setNumeroConsegne(10);
//		f.calcolaStipendio();
//		
//		Impiegato i = new Impiegato("Almo", "MAK");
//		
//		Magaziniere m = new Magaziniere ("Noah","MAK");
//		
//		System.out.println(d);
//		System.out.println(f);
//		System.out.println(i);
//		System.out.println(m);

	}

}
