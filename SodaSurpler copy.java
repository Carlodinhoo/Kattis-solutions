import java.util.*;

public class SodaSurpler{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int soda = 0;

		soda = soda(a,b,c);
		System.out.println(soda);


	}

	public static int soda(int a, int b, int c){
		int sodas = (a+b)/c;
		if(sodas == 1){
			return sodas;
		}else{
			sodas += soda(sodas, sodas%c, c);
		}

		return sodas;

	}
}