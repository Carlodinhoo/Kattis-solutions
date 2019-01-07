import java.util.*;

public class Game{
	public static void main(String args[]){
		int[][] tablero = new int[4][4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[i].length; j++){
				tablero[i][j] = sc.nextInt();
			}
		}
		
		int move = sc.nextInt();
		
	}
}