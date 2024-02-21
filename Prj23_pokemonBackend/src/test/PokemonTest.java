package test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import control.PokemonController;
import database.PokemonDAO;
import database.PokemonDaoImpl;
import model.Pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		
		try {
			PokemonController ctrl = new PokemonController();
			
			ArrayList<Pokemon> pokemons = ctrl.leggiFile();
			
			pokemons.forEach(p ->{
				System.out.println(p);	
			}); //-> funzione Lambda
			
			PokemonDAO dao = new PokemonDaoImpl();
			
			ArrayList<Pokemon> pokemonFuoco = new ArrayList<Pokemon>();
			for (Pokemon pokemon : pokemons) {
				if(pokemon.getTipo().contains("Fuoco")) {
					pokemonFuoco.add(pokemon);
				}
			}
			
			ctrl.scrivifile("files/pokemon-fuoco.txt", pokemonFuoco);
			
			for (Pokemon pokemon : pokemonFuoco) {
				dao.addPokemon(pokemon);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
