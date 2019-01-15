import java.util.*;

public class Conquest{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		int cont = 1;
		int zeros = 0;
		int cuadros = 0;
		int val = 1;
		int[][] tablero = new int[r][c];

		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				tablero[i][j] = 0;
			}
		}

		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			tablero[x-1][y-1] = val;

		}

		zeros = days(tablero, val);

		while(zeros != 0){
			zeros = days(tablero, val);
			cont++;
			val++;
		}
		System.out.println(cont);

	}

	public static int days(int[][] tablero, int val){

		int ind = 0;

		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				if(tablero[i][j] == val){
					if(j+1 < tablero[i].length && tablero[i][j+1] == 0){
						tablero[i][j+1] = val + 1;
					}
					if(j-1 >= 0 && tablero[i][j-1] < tablero[i].length && tablero[i][j-1] == 0){
						tablero[i][j-1] = val + 1;
					}
					if(i-1 >= 0 && tablero[i-1][j] < tablero[i].length && tablero[i-1][j] == 0){
						tablero[i-1][j] = val + 1;
					}
					
					if(i+1 < tablero.length && tablero[i+1][j] == 0){
						tablero[i+1][j] = val + 1;
					}
				}
			}		
		}

		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				if(tablero[i][j] == 0){
					ind++;
				}
			}
		}

		return ind;

	}
}