import java.util.*;

public class Conquest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		int cont = 0;
		int days = 1;
		int[][] tablero = new int[r][c];

		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				tablero[i][j] = 0;
				cont++;
			}
		}

		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			tablero[x-1][y-1] = 2;

		}

		//En vez de cambiar a uno suma un valor despues checas si los valores son mayores o igual a uno para verificar si ya fueron visitados
		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				if(tablero[i][j] == 2){
					if(j+1 < tablero[i].length && tablero[i][j+1] == 0){
						tablero[i][j+1] = 1;
					}
					if(j-1 < 0){
						j = 0;
					} 
					if(j < tablero[i].length && tablero[i][j-1] == 0){
						tablero[i][j-1] = 1;
					}
					cont--;
				}
			}
			
		}

		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
		/*
		if(cont == 0){
			System.out.print(days);
		}else{
			visit(tablero);
			days++;
		}*/
	}

	/*public static void visit(int[][] tablero){
		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[0].length; j++){
				if(tablero[i][j] == 1){
					if(j+1 < tablero[i].length && tablero[i][j+1] ){

					}
				}
			}
			
		}
	} */
}