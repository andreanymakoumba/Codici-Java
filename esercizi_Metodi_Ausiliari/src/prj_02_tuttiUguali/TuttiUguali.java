package prj_02_tuttiUguali;

import java.util.Scanner;

public class TuttiUguali {

	public static void main(String[] args) {

		//inserimento di 3 numeri all'utente 
		Scanner mioScanner = new Scanner(System.in);
		
		System.out.println("Inserisci 3 numeri: ");
		int inputNum1 = mioScanner.nextInt();
		int inputNum2 = mioScanner.nextInt();
		int inputNum3 = mioScanner.nextInt();
		
		//Metodo ausilario (Logica)
		
		numUguali(inputNum1,inputNum2,inputNum3);
		
		//chiusura dello scanner
		mioScanner.close();

	}
	
	//Metodo ausilARIO

	private static void numUguali(int inputNum1, int inputNum2, int inputNum3) {
		if(inputNum1 == inputNum2 || inputNum2 == inputNum3) {
			System.out.println("Tutti uguali");
		}
		else {
			System.out.println("Almeno uno è diverso");
		}
	}

}
