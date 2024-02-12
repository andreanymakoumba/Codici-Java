package model;

public abstract class FiguraGeometrica {
	
	protected String nomeFigura;
	protected double perimetro;
	protected String superfice;

	public FiguraGeometrica() {
		System.out.println("Figura geometrica costruita");
	}
	
	

	public String getNomeFigura() {
		return nomeFigura;
	}



	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}



	public abstract double calcolaSuperfice();
	public abstract  double calcolaPerimetro();



	@Override
	public String toString() {
		return "FiguraGeometrica [nomeFigura=" + nomeFigura + ","
				+ " calcolaSuperfice()=" + calcolaSuperfice()
				+ ", calcolaPerimetro()=" + calcolaPerimetro() + "]";
	}
	
	
	
	
}
