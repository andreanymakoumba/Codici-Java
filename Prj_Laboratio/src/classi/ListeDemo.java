package classi;

import java.util.ArrayList;

public class ListeDemo {

	public static void main(String[] args) {
		//ArrayList
		
		ArrayList<String> citta = new ArrayList<String>();
		
		citta.add("torino");
		citta.add("milano");
		citta.add("napoli");
		citta.add("roma");
		
		int numeroCitta = citta.size();
		System.out.println(numeroCitta);
		
		//citta.remove(2);
		
for(String comune : citta) {
	System.out.println(comune);
}
	}

}
