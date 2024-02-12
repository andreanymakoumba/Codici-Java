package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import model.EccezinePersonalizzata;

public class ProvaEccezioni2 {

	public static void main(String[] args) {
		
		File f = new File("studenti.txt");
		
		try (Scanner input = new Scanner(f);
				PrintWriter pw = new PrintWriter(f);
				) { //try-with-resources
			
			String[] giorni = {
					
					"lunedi",
					"martedi",
					"mercoledi",
					"giovedi",
					"venerdi",
					"sabato",
					"domenica",
						
			};
			
			
			for (String giorno : giorni) {
				pw.println(giorno);
				
				if (giorno.equals("giovedi"))
					throw new EccezinePersonalizzata ("giovedi non si lavora");
					
				//pw.println(giorno);
			}
			
		pw.close();
		
	} 
		
		catch (FileNotFoundException e) {
		//e.printStackTrace();
		System.out.println("si è verificato un errore nella lettura/scrittura");
	}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("game over");
	}
}
