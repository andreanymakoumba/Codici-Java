package test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.json.JSONArray;

import com.mysql.cj.xdevapi.JsonArray;

import control.PokemonController;
import model.Pokemon;

public class PokemonJson {

	public static void main(String[] args) {
		
		PokemonController pc;
		try {
			pc = new PokemonController();
			ArrayList<Pokemon> leggiFile = pc.leggiFile();
			JSONArray array = new JSONArray(leggiFile);
			System.out.println(leggiFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
