import java.util.*;

public class LeftBeehind{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while(true){
			int sweet = sc.nextInt();
			int sour = sc.nextInt();
			if (sweet == 0 && sour == 0){
				break;
			}
			int total = sweet + sour;
			if(total == 13){
				System.out.println("Never speak again");
			}else if(sweet > sour){
				System.out.println("To the convention");
			}else if(sweet < sour){
				System.out.println("Left beehind");
			}else{
				System.out.println("Undecided");
			}
		}
	}
}