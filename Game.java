import java.util.*;

public class Game{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(0);
		lista.add(2);
		lista.add(4);
		lista.add(16);
		lista.add(32);
		lista.add(64);
		lista.add(128);
		lista.add(256);
		lista.add(512);
		lista.add(1024);
		lista.add(2048);
		//lista = {0,2,4,16,32,64,128,256,512,1024};
		/*
		int[][] tablero = new int[4][4];
		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[i].length; j++){
				tablero[i][j] = sc.nextInt();
			}
		}*/
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int move = sc.nextInt();

		if(move == 0){
			sumaIzq(arr, lista);
		}

		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		
	}

	public static void sumaIzq(int[] arr, List lista){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != 0){
				for(int j = i+1; j < arr.length; j++){
					if(arr[j] == 0){
						continue;
					}else{
						int temp = arr[i] + arr[j];
						if(lista.contains(temp)){
							arr[i] += arr[j];
							arr[j] = 0;
						}
					}
				}
			}
		}
	}
}