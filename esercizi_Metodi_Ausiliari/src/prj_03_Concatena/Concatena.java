package prj_03_Concatena;

import java.util.Scanner;

class Concatena {

	public static void main(String[] args) {
		
		Scanner mioScanner = new Scanner(System.in);
		
		//inserimento delle stringhe dall'utenete
		System.out.println("Inserisci la prima parola: ");
		String parola1 = mioScanner.nextLine();
		
		System.out.println("Inserisci la seconda parola: ");
		String parola2 = mioScanner.nextLine();
		
		System.out.println("Inserisci l'ultima parola: ");
		String parola3 = mioScanner.nextLine();
		
		//metodo ausilario
		
		String risultato = concatenaParole(parola1,parola2,parola3);
		
		System.out.println(risultato);
		
		//chiusura scanner
		
		mioScanner.close();
		
		
	}

	private static String concatenaParole(String parola1, String parola2, String parola3) {
		return parola1 + "*" + parola2 + "*" +parola3;
		
	}

}
