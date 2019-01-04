import java.util.*;

public class Easiest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)
				break;
			int digito = sumarDigito(n);
			int mul;
			int menor = 100;
			for(int i = 100; i > 10; i--){
				mul = n*i;
				mul = sumarDigito(mul);
				if(mul == digito && i < menor){
					menor = i;
				}
			}
			System.out.println(menor);
		}
		
	}

	public static int sumarDigito(int num){
		int sum_dig = 0;
		while(num > 0){
			sum_dig += num%10;
			num /= 10;
		}

		return sum_dig;
	}
}