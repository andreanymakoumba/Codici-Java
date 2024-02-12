package model;

public class Quadrato extends Rettangolo implements Misurabile {

	private Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
		
	}

	@Override
	public double superfice() {
		System.out.println("Metodo Quadrato");
		return Math.pow(this.lato.lunghezza(), 2);
	}

	@Override
	public void misurami() {
		// TODO Auto-generated method stub
		
	}

	
}
