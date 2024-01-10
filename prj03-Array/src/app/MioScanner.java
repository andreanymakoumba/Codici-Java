package app;

import java.util.Scanner;

public class MioScanner {

	public static String chiediAlUtente(String domanda) {
		//dichiaro e inizializzo un oggetto di tipo scanner
		Scanner scanner = new Scanner(System.in);
		
		//faccio la domanda all'utenete
		System.out.println(domanda);
		
		//ritorna la risposta in String
		return scanner.nextLine();
	}

}
