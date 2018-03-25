import java.util.*;

public class Hero{

	public static boolean habilidades(String cadena){
		
		for(int i = 0; i < cadena.length()-1; i++){
			if(cadena.charAt(i) == 'C' && cadena.charAt(i+1) == 'D'){
				return true;
			}
			
		}

		return false;
	}
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int batallas = sc.nextInt();
		String powers;
		int cont = batallas;

		for(int i = 0; i < batallas; i++){
			powers = sc.next();
			if(habilidades(powers) == true)
				cont--;
				
		}

		System.out.println(cont);
	}
}