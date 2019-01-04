import java.util.*;

public class Tri{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		boolean bandera = true;

		if(x+y == z && bandera == true){
			System.out.println(x+"+"+y+"="+z);
			bandera = false;
		}else if (y+z == x && bandera == true) {
			System.out.println(x+"="+y+"+"+z);
			bandera = false;
		}
		if(x-y == z && bandera == true){
			System.out.println(x+"-"+y+"="+z);
			bandera = false;
		}else if (y-z == x && bandera == true) {
			System.out.println(x+"="+y+"-"+z);
			bandera = false;
		}
		if(x*y == z && bandera == true){
			System.out.println(x+"*"+y+"="+z);
			bandera = false;
		}else if (y*z == x && bandera == true) {
			System.out.println(x+"="+y+"*"+z);
			bandera = false;
		}
		if(x/y == z && bandera == true){
			System.out.println(x+"/"+y+"="+z);
			bandera = false;
		}else if (y/z == x && bandera == true) {
			System.out.println(x+"="+y+"/"+z);
			bandera = false;
		}
	}
}