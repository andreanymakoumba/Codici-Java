package array;

public class MonoDimenzionale {

	public static void main(String[] args) {
		 int[] voti = new int[5];
		 
		 int[] voti2 = {25,24,26,28,27};
		 
		 voti[0] = 22;
		 voti[1] = 23;
		 voti[2] = 24;
		 voti[3] = 25;
		 voti[4] = 26;
		 
/* per scorrere l'array
		 for (int i = 0; i < voti2.length; i++) {
			System.out.println(voti[i]);
			
		} */
		 
		 //con il foreach
		 
		 for (int voto : voti2) {
			System.out.println(voto);
		}
	}

}
