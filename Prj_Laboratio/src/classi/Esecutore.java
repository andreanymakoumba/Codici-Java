package classi;

public class Esecutore {

	public static void main(String[] args) {
		//OverLoad: diversi metodi con stesso identificatore ma con firma differente
		raddopia(4);
		raddopia("4"); 

	}

	private static void raddopia(int i) {
		System.out.println(i+i);
		
	}

	private static void raddopia(String i) {
		System.out.println(i + i);
		
	}

}
