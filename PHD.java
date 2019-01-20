import java.util.*;

public class PHD{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String s = sc.next();
			int suma = 0;
			if(s.equals("P=NP")){
				System.out.println("skipped");
			}else{
				String[] arr = s.split("\\+");
				for (String number : arr) {
					suma += Integer.parseInt(number);
				}
				System.out.println(suma);
			}
		}
	}
}