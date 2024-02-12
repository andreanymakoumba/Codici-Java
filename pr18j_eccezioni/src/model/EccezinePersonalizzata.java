package model;

public class EccezinePersonalizzata extends Exception {

	public EccezinePersonalizzata (String messaggio) {
		super ("Questa è la mia eccezione personalizzata");
		System.out.println(messaggio);
		
	}
}
