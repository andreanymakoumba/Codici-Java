package prj_01_Ripetti;

import java.util.Scanner;

public class Ripeti {

	public static void main(String[] args) {
		//per far scrivere all'utente 
		Scanner mioScanner = new Scanner(System.in);
		
		//inserire una stringa dall'utente 
		System.out.println("Inserisci una stringa: ");
		String miaStringa = mioScanner.nextLine();
		
		//numero positivo dall'utente 
		System.out.println("Inserisci un numero positivo: ");
		int numRipetizioni = mioScanner.nextInt();
		
		//Chiamata del metodo Ausilario
		ripetiString(miaStringa, numRipetizioni);
		
		//chiudere lo scanner
		mioScanner.close();
	}
	
	//Metodo Ausilario (Logica)

	private static void ripetiString(String miaStringa, int numRipetizioni) {
		
		if (numRipetizioni >= 0) {
			for (int i = 0; i < numRipetizioni; i++) {
				System.out.println(miaStringa);
			}
		}
		else{
			System.out.println("ERRORE: numero negativo");
		}
	}
}
		

