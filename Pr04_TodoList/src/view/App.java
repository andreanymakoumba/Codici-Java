package view;

import java.util.Scanner;

import controller.Todo;
import controller.TodoController;

public class App {

	public static void main(String[] args) {
		
		boolean gira = true;
		
		TodoController ctrl = new TodoController();
		
		while(gira) {
			System.out.println(menu());
			
			int risposta = domanda ("quale opzione scegli?");
			
			if (risposta == 0) {
				gira = false;
			}
			
			if (risposta == 1) {
				System.out.println("Vuoi aggiungere un nuovo todo!");
				String desc = chiediStrind("Descrizione dela nota");
				int pos = domanda("in quale posizione vuoi inserire il todo?");
				ctrl.addTodo(desc, pos);
			}
			
			if (risposta == 2) {
				System.out.println("Vuoi stampare i todo!");
				Todo [] listaTodo = ctrl.lista;
				
				for (Todo todo : listaTodo) {
					
					if (todo != null) {
						System.out.println(todo.stampa());
					}else
						System.out.println("---");
					
					
					//System.out.println(todo.descrizione);
				}
			}
			
			
			System.out.println("L'utente ha scelto l'opzione " + risposta);
			
		}
		
		
		
	System.out.println("grazie per aver usato il nostro software");
		

	}
	private static String chiediStrind(String domanda) {
		
		System.out.println(domanda);
		
		Scanner epson = new Scanner(System.in);
		return epson.nextLine();
		
	}
	// firma del metodo domanda
	
	private static int domanda (String question) {
		
		System.out.println(question);
		int answer = 0;
		
		Scanner canon = new Scanner(System.in);
		answer = canon.nextInt();
		//canon.nextLine();
		//canon.close();
		
		return answer;
	}

	private static String menu() {
		String s = "";
		
		s = s.concat("******************** \n");
		s += "1) add todo\n";
		s = s.concat("2) print all \n");
		s = s.concat("0) exit \n");
		s = s.concat("******************** \n");
		
		return s;
	}
	
	

}
