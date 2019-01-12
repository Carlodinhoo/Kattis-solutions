import java.util.*;

public class Conquest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		int[][] tablero = new int[r][c];

		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				tablero[i][j] = 0;
			}
		}

		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			tablero[x-1][y-1] = 1;
		}

		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				if(tablero[i][j] == 1){
					tablero[][]
				}
			}
			
		}

		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
	}
}