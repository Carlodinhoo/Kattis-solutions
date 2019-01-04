import java.util.*;

public class Apaxians{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		String nueva = "";
		nueva += cadena.charAt(0);
		for(int i = 1; i < cadena.length(); i++){
			if(cadena.charAt(i) != cadena.charAt(i-1)){
				nueva += cadena.charAt(i);
			}
		}

		System.out.println(nueva);
	}
}