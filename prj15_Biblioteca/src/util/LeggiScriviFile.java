package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class LeggiScriviFile {
	
	public static ArrayList<String> leggi(File f){
		ArrayList<String> righeFile = new ArrayList<String> ();
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
		Scanner scanner = new Scanner(f);
		righeFile.add("test");
		String string;
		
		while(scanner.hasNextLine()) {
			righeFile.add(scanner.nextLine());
			//System.out.println("lettura riga" + string);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return righeFile;

	}
	public static void scrivi(File f, String s) {
		try {
			PrintWriter out = new PrintWriter(f);
			out.print(s);
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

