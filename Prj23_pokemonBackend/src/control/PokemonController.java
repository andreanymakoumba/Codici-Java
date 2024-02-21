package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Pokemon;

public class PokemonController {

	private ArrayList<Pokemon> collezione;
	private Scanner scanner;
	private PrintWriter pw;
	private File f;

	public PokemonController() throws FileNotFoundException {

		this.collezione = new ArrayList<Pokemon>();
		this.f = new File("files/Pokémon_Tipi.txt");
	
		this.scanner = new Scanner(f);
		//System.out.println("costruttore");
	}

	public ArrayList<Pokemon> leggiFile() {
		this.collezione.clear(); // svuoto la collezione

		while (scanner.hasNextLine()) {
			scanner.nextLine();
			String riga = scanner.nextLine();
			//System.out.println("riga" +riga);
			String parole[] = riga.split(","); // \t e il segno della tabulazione
			
			if(parole.length > 0) {
				
				try {
					int id = Integer.parseInt(parole[0]);
					String nome = parole[1];
					String tipo = parole[2];
					
					Pokemon p = new Pokemon(id, nome, tipo);
					this.collezione.add(p);
					
				}
				 catch(Exception e) {
					 //System.out.println("lettura riga non riuscita");
					 
				 }
			}


		}
		return this.collezione;
	}
	public void scrivifile (String nomeFile, ArrayList<Pokemon>listaPokemon) throws FileNotFoundException {
		this.pw = new PrintWriter(new File(nomeFile));
		//TODO: Scorrere ArrayList di pokemon
		for (Pokemon p : listaPokemon) {
			//TODO: Per ogni pokemon scrivo una riga sul file
			pw.println(p.getNome());
		}
		//TODO: chiudo il file
		pw.close();
	}
}
