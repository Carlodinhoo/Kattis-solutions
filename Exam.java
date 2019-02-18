import java.util.*;

public class Exam{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String myanswers = sc.next();
		String friendanswers = sc.next();
		int same = 0;
		int dif = 0;

		for(int i = 0; i < myanswers.length(); i++){
			if(friendanswers.charAt(i) == myanswers.charAt(i)){
				same++;
			}else{
				dif++;
			}
		}

		int ans = 0;

		if(n < same){
			ans = n + dif;
		}else{
			ans = dif - n;
		}

		System.out.println(ans);

	}
}