import java.util.*;
import java.lang.Math;

public class NumberFun{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			boolean bandera = false;

			int suma = a+b;
			int resta = a-b;
			int resta2 = b-a;
			int mul = a*b;
			int div = a/b;
			int div2 = b/a;

			if(bandera == false && suma == c){
				System.out.println("Possible");
				bandera = true;
			}else if(bandera == false && resta == c || resta2 == c){
				System.out.println("Possible");
				bandera = true;
			}else if(bandera == false && mul == c){
				System.out.println("Possible");
				bandera = true;
			}else if(bandera == false && div == c && div*b == a){
				System.out.println("Possible");
				bandera = true;
			}else if(bandera == false && div2 == c && div2*a == b){
				System.out.println("Possible");
				bandera = true;
			}else{
				System.out.println("Impossible");
			}

		}
	}
}