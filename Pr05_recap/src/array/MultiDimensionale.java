package array;

import java.util.Iterator;

public class MultiDimensionale {

	public static void main(String[] args) {
		
		int [][] coordinate = new int [3][2];
		
		coordinate [0][0] = 10;
		coordinate [0][1] = 10;
		
		coordinate [1][0] = 3;
		coordinate [1][1] = 4;
		
		coordinate [1][0] = 8;
		coordinate [1][1] = 7;
		
		coordinate [2][0] = 6;
		coordinate [2][1] = 5;
		
		//For classico
		//Righe
		
		for(int i = 0; i < coordinate.length; i++) {
			
			//colonne
			
			for(int j = 0; j < 2; j++) {
				System.out.println(coordinate[i][j] + "|");
			}
			System.out.println("\n---"); 
		}
		
	}

}
