package demo;

public class ProvaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String saluto = "ciao"; //primo modo per inizializzare una Stringa
		String salutoObj = new String ("ciao"); // secondo modo
		
		char[] saluto2 = {'c', 'i','a','o'};
		
		//trasforma in una array di caratteri, un char array da una string
		
		char[] saluto3 = saluto.toCharArray();
		
		//ottengo una String da un char[]
		
		String saluto4 = new String(saluto2); 
		
		char primochar =saluto.charAt(0);
		char primochar2 = saluto2[0];
		
		System.out.println(primochar == primochar2);
		System.out.println(saluto.length() == saluto2.length);

	}

}
