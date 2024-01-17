package esercitazioniVacanze;

public class Figura3 {

	public static void main(String[] args) {
		//parte che cresce
		for(int i = 1 ; i <= 6; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			//spazi tra le 2 figure
			
			for(int k = 1; k <= 6 - i; k++) {
				System.out.print("    ");
			}
			// parte che decresce
			for(int l = 6 - i + 1; l >= 1; l--) {
				System.out.print(l);
			}
			
			System.out.println();
			
		}
	}

}
