import java.util.*;

public class Statistics{

	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int x;

		for(int i = 0; i < 3; i++){
			x = sc.nextInt();
			list.add(x);

		}
		Collections.sort(list);

		int min = list.get(0);
		int max = list.get(list.size()-1);
		int range = (list.get(list.size()-1))-list.get(0);

		System.out.println("Case 1: "+min+" "+max+" "+range);

	}
}