package demo;

public class ProvaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creazione del nuovo Array tipo piu quanti elementi ci sono
		
		int[] voti = new int[10];
		voti [0] = 27;
		voti [1] = 28;
		voti [2] = 22;
		voti [3] = 24;
		voti [4] = 26;
		
		//shortcut
		
		int[] voti2 = {27,28,22,24,26};
		
		//scorrere l'array per avere la media 
		
		// per fare la somma di tutti i voti
		int somma = 0;
		
		for (int i = 0; i < voti2.length; i++) {
			somma += voti2[i];
		}
		System.out.println("il totale dei voti è: " + somma);
		
		//la media di tutti i voti
		
		double media = (double)somma / voti2.length;
		System.out.println("la media è: " + media);

	}

}
