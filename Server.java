import java.util.*;

public class Server{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int task = sc.nextInt();
		int time = sc.nextInt();
		int total = 0;
		int cont = 0;
		while(task > 0){
			int n = sc.nextInt();
			total += n;
			if(total > time){
				break;
			}
			cont++;
			task--;
		}
		System.out.println(cont);
	}
}