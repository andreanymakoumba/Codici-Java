package app;

public class Applicativo {

	public static void main(String[] args) {
		
String[] listaCoseDaFare = new String[10];

//chiedi all'utente per 10 volte cosa vuole comprare
//posso metterlo anche dentro ad un'altro metodo private static void chiedi(String[] listaCoseDaFare)
final int VOLTE = 10;
final String DOMANDA = "cosa vuoi comprare";

for(int i = 0; i < VOLTE; i++) {
	
	listaCoseDaFare[i] = MioScanner.chiediAlUtente(DOMANDA);
	
}//fine ciclo for

stampaLista(listaCoseDaFare);


	}//fine metodo main
	
	
	//metodo stampaLista

	private static void stampaLista(String[] listaCoseDaFare) {
		
		for (int i = 0; i < listaCoseDaFare.length; i++) {
			System.out.println(listaCoseDaFare[i]);
		}
		
		
	}
	

}//fine classe Applicativo
