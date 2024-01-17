package esercitazioniVacanze;

public class TriangoloIsoscele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i = 1; i <= 5; i++) {
	
	//spazio prima di A
	
	for(int j = 1; j <= 5 - i; j++) {
		System.out.print(" ");
	}
	// Lettera A
	
	for(int k = 1; k <= (i * 2) - 1; k++) {
		System.out.print("A");
	}
	System.out.println();
	  
	}
	}

}
