import java.util.*;

public class PaulEigon{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		int paul = sc.nextInt();
		int opp = sc.nextInt();
		int sum = paul+opp;
		//sum++;
		if((sum/round)%2 == 0){
			System.out.println("paul");
		}else{
			System.out.println("opponent");
		}
	}
}