import java.util.*;

public class Hydra{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		do{
			x = sc.nextInt();
			y = sc.nextInt();
			int head = x;
			int tail = y;
			int moves = 0;
			boolean alive = true;

			while(alive == true){
				if(head%2 != 0){
					if(tail-2 >= 0){
						tail -= 2;
						head++;
						moves++;
					}
				}else if(head-2 >= 0){
					head -=2;
					moves++;
				}
				if((head == 0 || head == 1) && tail/2 != 2 && tail != 0){
					tail++;
					moves++;
				}else if(tail/2 == 2 && tail-2 >= 0){
					head++;
					tail -= 2;
					moves++;
				}

				if(head == 0 && tail == 0){
					alive = false;
				}
			}
			if(x != 0 && y != 0){
				System.out.println(moves);
			}
		}while(x != 0 && y != 0);
	}
}