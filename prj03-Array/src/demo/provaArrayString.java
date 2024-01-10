package demo;

public class provaArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] note = {"do", "re","mi", "fa","sol","la", "si"};
		System.out.println(note.length);
		
		for(int i = 0; i < note.length; i++) {
			System.out.println("la nota alla posizione " + i);
			System.out.println(note[i]);
		}
		
	}

}
