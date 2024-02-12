package model;

import java.util.Random;

public class Dado {

	//stato interno
	private int facce;
	private String color;
	private int faccia;
	
	public Dado() {//scompare il costruttore di default

		this.facce = 6;
		this.color = "bianco";
	}

	
	
	//overload
	
	public Dado(int facce) {
		super();
		this.facce = facce;
		this.color = "bianco";
	}



	public Dado(int facce, String color) {
		this.facce = facce;
		this.color = "bianco";
	}



	public Dado(String color) {
		this.facce = 6;
		this.color = color;
	}
	
	
	public void lancia () {
		int casuale = 1;
		Random r = new Random();
		casuale = r.nextInt(this.facce) +1;
		this.faccia = casuale;
		
	}
	
	public int getFaccia() {
		return faccia;
	}
}
