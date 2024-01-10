package logica;

public class Rubrica {

	public Contatto [] contatti;
	
	//Costruttore Rubrica
	
	public Rubrica(int numeroContatti) {
		
		this.contatti = new Contatto[numeroContatti];
	}
	
	//metodo per aggiungere il num alla posizione vuota
	public boolean addContatto(String nome, String numero) {
		
		Contatto c = new Contatto(nome, numero);
		int pos = trovaPosizioneLibera();
		
		if (pos > -1) {
			this.contatti[pos] = c;
			System.out.println("Contatto inserito");
			return true;
		}else {
			System.out.println("La rubrica è piena.");
			return false;
		}
	}
	
	//Metodo per trovare la posizione vuota nella rubrica
	
	public int trovaPosizioneLibera() {
		int pos = -1; /*perché l'array comincia sempre con 0 e
		quindi -1 sarà sempre fuori dall'array */
		
		for (int i = 0; i < contatti.length; i++) {
			if (contatti [i] == null)
				return i;
		}
			
		return pos;
	}
	
	//metodo p
	public int contaContatti() {
		int totale = 0;
		for(Contatto contatto : contatti) {
			if (contatto != null)
				totale++;
		}
		return totale;
	}
}
