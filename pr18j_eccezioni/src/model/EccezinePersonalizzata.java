package model;

public class EccezinePersonalizzata extends Exception {

	public EccezinePersonalizzata (String messaggio) {
		super ("Questa � la mia eccezione personalizzata");
		System.out.println(messaggio);
		
	}
}
