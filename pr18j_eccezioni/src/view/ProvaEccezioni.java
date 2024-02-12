package view;

public class ProvaEccezioni {
	
	public static void main(String[] args) {
		int[] voti = {22,24,25,27,28,30,32};
		
		try {
			for (int i = 0; i <= voti.length; i++) {
				double divisione = voti[i] / i;
				System.out.println(voti[i]);
			}
			
		
		
		} 
		catch (ArithmeticException e) {
			System.err.println("mi dispiace si è verificato un eccezione di tipo arithmetico");
		}
		
		
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println();
		}
		
		
		catch (Exception e){
			
			System.err.println("Mi dispiace si è verificato un eccezione");
			System.out.println(e.getMessage());
			
		}
		
		
		finally {
			System.out.println("Comunque vada io termino le mie operazioni prima di uscire");
		}
		
		System.out.println("finito");
	}

}
