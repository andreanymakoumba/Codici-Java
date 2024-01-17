package esercitazioniVacanze;

import java.util.Scanner;

public class TuttiPositiviPari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		//richiesta all'utente 
		System.out.println("Inserisci il numero di interi: ");
		int numeroInteri = myScanner.nextInt();
		
		// Inizializza la variabile per contare i numeri positivi e pari
        int contatorePositiviPari = 0;
        
     // Ciclo per l'inserimento dei numeri
        for (int i = 1; i <= numeroInteri; i++) {
            System.out.print("Inserisci il " + i + "° numero: ");
            int numero = myScanner.nextInt();

            // Verifica se il numero è positivo e pari
            if (numero > 0 && numero % 2 == 0) {
                contatorePositiviPari++;
            }
        }

        // Verifica se tutti i numeri sono positivi e pari
        if (contatorePositiviPari == numeroInteri) {
            System.out.println("Tutti positivi e pari");
        } else {
            System.out.println("NO");
        }
	}

}
