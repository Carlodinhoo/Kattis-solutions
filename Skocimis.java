import java.util.*;

public class Skocimis{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cont = 0;
		int res = Math.max(b-a-1, Math.max(c-b-1, 0));
		System.out.println(res);
	

	}	
}