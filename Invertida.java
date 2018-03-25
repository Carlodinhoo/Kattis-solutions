import java.util.*;

public class Invertida{

	//Esta es otra manera mas eficiente
	/*public static String invertir(String texto){
		if(texto.length() == 1){
			return texto;
		}else
			return invertir(texto.substring(1)) + texto.charAt(0);
		
	}*/
	
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 String cadena = sc.next();
		 String invertida = "";
		 //System.out.print(invertir(cadena));

		 //Esta es una forma de invertir una cadena
		 for (int i = cadena.length()-1; i >= 0; i--){
		 		invertida = invertida+cadena.charAt(i);
		 }
		 System.out.print(invertida);
		 
	}
}