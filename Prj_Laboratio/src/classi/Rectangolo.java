package classi;

public class Rectangolo {
	
	private int base, altezza;

	//Costruttore di Retangolo
	public Rectangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double area() {
		return this.base * this.altezza;
	}
	
	public double perimentro(String s) {
		return (this.base + this.altezza) * 2;

	}
	
	public double perimetro (boolean casuale) {
		return this.base *2 + this.altezza * 2;
	}

}
