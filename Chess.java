import java.util.*;

public class Chess{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char x1 = sc.next().charAt(0);
		int y1 = sc.nextInt();
		char x2 = sc.next().charAt(0);
		int y2 = sc.nextInt();
		int[][] arr = new int[8][8];
		int square = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(j%2 == 1 && i%2 == 1 || j%2 == 0 && i%2 == 0){
					arr[i][j] = 0;
				}else{
					arr[i][j] = 1;
				}
			}
		}
		int number = (int) x1;
		int coorX1 = number-65;
		int coorY1 = 8-y1;
		int number2 = (int) x2;
		int coorX2 = number2-65;
		int coorY2 = 8-y2;
		//int val = arr[coorY1][coorX1];
		//int val2 = arr[coorY2][coorX1];
		arr[coorY1][coorX1] = 5;
		arr[coorY2][coorX2] = 6;
		/*
		if(val == val2){
			System.out.println("possible "+ val+" "+val2);
		}else{
			System.out.println("impossible"+ val+" "+val2);
		}*/

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}