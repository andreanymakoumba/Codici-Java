package vista;

import modello.Studente;

public class StudenteDemo {

	public static void main(String[] args) {
		
		Studente s1 = new Studente("Best", "Mak");
		Studente s2 = new Studente("Albert", "MAKOUMBA");
		/* String nomeS1 = s1.getNome();
		
System.out.println(s1.getNome());
s1.setNome(nomeS1);
System.out.println(s1.getNome());   */
		
System.out.println(s1);
System.out.println(s2);
	} 

}
