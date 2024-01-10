import java.util.Scanner;

public class RadiceQuadrata {

	public static void main(String[] args) {
		
		//per far scrivere all'utente
		
		System.out.println("inserisci il numero: ");
		
		Scanner mioScanner = new Scanner(System.in);
		int numero = mioScanner.nextInt();
		
		double radiceQuadrata = Math.sqrt(numero);
		
		System.out.println("la radice quadrata è: " + radiceQuadrata);
		
	}

}
