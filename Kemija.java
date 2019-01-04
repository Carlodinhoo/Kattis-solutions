import java.util.*;

public class Kemija{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		
		cadena = cadena.replace("apa","a");
		cadena = cadena.replace("epe","e");
		cadena = cadena.replace("ipi","i");
		cadena = cadena.replace("opo","o");
		cadena = cadena.replace("upu","u");

		System.out.println(cadena);
		


	}
}