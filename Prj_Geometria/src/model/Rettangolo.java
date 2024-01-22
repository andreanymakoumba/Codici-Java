package model;

public class Rettangolo {

	private Segmento base, altezza;
	
	//Costruttore
	
	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
		
	}
	
	public double perimetro() {
		
		return 2*(this.base.lunghezza() * this.altezza.lunghezza());
	}
	
	public double superfice() {
		
		System.out.println("metodo del Rettangolo");
		return this.base.lunghezza() * this.altezza.lunghezza();
		
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", perimetro()=" + perimetro() + ", superfice()="
				+ superfice() + "]";
	}
	
	
	
}
