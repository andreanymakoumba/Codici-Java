package modello;

public class Studente {
//stato interno della classe:
	//propriet� degli oggetti di tipo Studente
	//detto anche attributi, fields
	
	private String nome;
	private String cognome;
	// altre propriet�
	private int nMat;
	
	private static int contatore = 1;

	//metodi costruttori
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.nMat = contatore++;
	}

	// metodo Getters per accedere alle propriet�
	// con il nome della propriet� in maiuscolo
	//Alt + shift + S

	public int getnMat() {
		return nMat;
	}


	public String getNome() {
		return this.nome.toUpperCase();
	}

//setters per modificare le propriet� di un oggetto
	public void setNome(String nome) {
		if (nome.equals(nome))
			this.nome = nome;
	}

	
	
	//metodi custom
	
	//metodi toString: � la rapresentazione dell'oggetto in Stringa
	
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", nMat=" + nMat + "]";
	}
	
}
