import java.util.*;

public class Encoding{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String cadena = sc.nextLine();
		String e;
		String d;
		if(input.charAt(0) == 'E'){
			e = encode(cadena);
			System.out.println(e);
		}else{
			d = decode(cadena);
			System.out.println(d);
		}
		
	}

	public static String encode(String cadena){
		String nueva = "";
		nueva += cadena.charAt(0);
		int cont = 1;
		for(int i = 1; i < cadena.length(); i++){
			
			if(cadena.charAt(i) != cadena.charAt(i-1)){
				nueva += cont;
				nueva += cadena.charAt(i);
				cont = 1;
			}else{
				cont++;
			}
		}
		nueva += cont;

		return nueva;
	}

	public static String decode(String cadena){
		String nueva = "";
		for(int i = 1; i < cadena.length(); i+=2){
			int num = Integer.parseInt(String.valueOf(cadena.charAt(i)));
			while(num > 0){
				nueva += cadena.charAt(i-1);
				num--;
			}
		}

		return nueva;
	}
}