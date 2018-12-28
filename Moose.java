import java.util.*;

public class Moose{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int suma = l+r;

		if(l == r && suma != 0){
			System.out.println("Even "+suma);
		}else if(suma == 0){
			System.out.println("Not a Moose");
		}else{
			if(l > r){
				l = l*2;
				System.out.println("Odd "+l);
			}else{
				r = r*2;
				System.out.println("Odd "+r);
			}
			
		}
	}
}