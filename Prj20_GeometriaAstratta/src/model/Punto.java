package model;

public class Punto {
	private int x, y;
	
	public Punto() { //new punto()
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(int x) {  //new punto(1)
		this.x = x;
		this.y = y;
	}
	
	public Punto(int x, int y) { //new punto(1,2)
		this.x = x;
		this.y = y;
	}

	
	
	// getters and setters
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//metodo toString
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	

}
