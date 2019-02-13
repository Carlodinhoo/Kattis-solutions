import java.util.*;

public class ReverseTwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		int num = sc.nextInt();
		String cadena = sc.nextLine().substring(1);
		String way = "";

		for(int i = cadena.length()-1; i >= 0; i--){
			int index = 0;
			for(int j = 0; j < letters.length(); j++){
				if(cadena.charAt(i) == letters.charAt(j)){
					index = j + num;
				}
			}
			System.out.println(index);
			// Esta era la solucion, estaba refacil :(
			index %= letters.length();
			System.out.println(index);
			way += letters.charAt(index); 
		}

		System.out.println(way);
	}
}