import java.util.*;

public class ReverseRot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		int ext = sc.nextInt();
		String reverse = "";
		/*
		for(int i = cadena.length()-1; i >= 0; i--){
			int number = (int) cadena.charAt(i);
			number += ext;
			char a = (char) number;
			reverse += a;
		}*/
		for(int i = cadena.length()-1; i >= 0; i--){
			int num = (int) cadena.charAt(i);
			int aux = (num-65+ext)%28+65;
			char a = (char) aux;
			reverse += a;
			System.out.println(aux);
		}
		System.out.println(reverse);
	}
}