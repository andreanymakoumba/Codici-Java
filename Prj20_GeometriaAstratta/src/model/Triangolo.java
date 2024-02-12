package model;

public class Triangolo extends FiguraGeometrica  implements Misurabile{

	private Punto a,b,c;
	private Segmento ab,ac,bc;
	
	//Costruttori
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a,b);
		this.ac = new Segmento(a,c);
		this.bc = new Segmento(b,c);
	}
	
	//metodi
	public double perimetro() {
		return ab.lunghezza() + ac.lunghezza() + bc.lunghezza();
	}
	
	public double superfice() {
		
		double sp = perimetro()/2;
		
		return Math.sqrt(sp * (sp-ab.lunghezza()) * 
				(sp-ac.lunghezza()) * 
				(sp-bc.lunghezza())
				);
		
	}

	@Override
	public String toString() {
		return "Triangolo [a=" + a + ", b=" + b + ", c=" + c + ", ab=" + ab + ", ac=" + ac + ", bc=" + bc
				+ ", perimetro()=" + perimetro() + ", superfice()=" + superfice() + "]";
	}

	@Override
	public double calcolaSuperfice() {
		// TODO Auto-generated method stub
		return superfice();
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return perimetro();
	}

	@Override
	public void misurami() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
