package vista;

import controllo.RegistroController;
import modello.Registro;
import modello.Studente;

public class RegistroDemo {

	public static void main(String[] args) {
		Registro tss2024 = new Registro("Corso TSS 2024");
		
		RegistroController ctrl = new RegistroController(tss2024);
		ctrl.caricaStudentiDaFile();
		ctrl.faiAppello();
		ctrl.stampaPresenti();
		ctrl.stampaAssenti();
		
		//Studente s1 = new Studente("Best", "Makoumba");
		//Studente s2 = new Studente("Albert", "Makoumba");
		
		//tss2024.aggiungiStudente(s1);
		//tss2024.aggiungiStudente(s2);
		
		
		tss2024.getStudenteById(0);
		
		for(Studente s : tss2024.getAllStudents()) {
			System.out.println(s);
		}

	}

}
