import java.util.*;

public class Parking{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] precios = {0, sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int[] timer = new int[101];
		int j = 3;
		while(j > 0){
			int arrival = sc.nextInt();
			int departure = sc.nextInt();
			for(int i = arrival; i < departure; i++){
				timer[i]++;
			}
			j--;
		}

		
		int total = 0;

		for(int i = 0; i < 100; i++){
			total += timer[i]*precios[timer[i]];
		}

		System.out.println(total);
	}



}