package esercitazioniVacanze;

import java.util.Scanner;

public class Tabellina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("inserisci numero");
		
		int numero = myScanner.nextInt();
		
		System.out.println("la tebellina di" + numero + "è:" );
		for(int i = 0; i <= 12; i++) {
			System.out.println(numero + "X" + i + "=" + (numero * i));
		}
	}

}
