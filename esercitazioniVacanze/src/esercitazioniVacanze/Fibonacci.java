package esercitazioniVacanze;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroElementi = 100;
		
		//i primi 2 elementi
		long primoElemento = 0;
		long secondoElemento = 1;
		
		
	// stamoiamo i numeri
		System.out.print(primoElemento + " " + secondoElemento + " ");
		
		for(int i = 2; i < numeroElementi; i++) {
			long elementoSuccessivo = primoElemento + secondoElemento; 
			System.out.print(elementoSuccessivo + " ");
			primoElemento = secondoElemento;
			secondoElemento = elementoSuccessivo; 
		}
	}

}
