package model;

public class Dipendente {
	
	private int numeroMatricola;
	private static int matricolatore = 1;
	
	protected String nome;
	protected String cognome;
	protected double stipendio; 
	
	//Costruttore
	public Dipendente(String nome, String cognome) {
		//super();
		this.nome = nome;
		this.cognome = cognome;
		this.numeroMatricola = matricolatore++;
		
	}
	

	@Override
	public String toString() {
		return "Dipendente [numeroMatricola=" + numeroMatricola + ", nome=" + nome + ", cognome=" + cognome
				+ ", stipendio=" + stipendio + "]";
	}
	
	
	
	
}
