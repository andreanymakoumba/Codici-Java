import java.util.Scanner;

public class PerimetroRettangolo {

	public static void main(String[] args) {
		
		 //far scrivere dall'utente
		Scanner mioScanner = new Scanner(System.in);
		
		System.out.println("inserisci la lunghezza: ");
		
		int lunghezza = mioScanner.nextInt();
		
		System.out.println("inserisci la larghezza: ");
		int larghezza = mioScanner.nextInt();
		
		int perimetro = (lunghezza + larghezza) * 2; 
		
		System.out.println("il perimetro è: " + perimetro);
		
	}

}
