import java.util.*;

public class ReverseRot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ext;
		while(true){
			ext = sc.nextInt();

			if(ext == 0){
				break;
			}

			String cadena = sc.nextLine().substring(1);
			String reverse = "";

			for(int i = cadena.length()-1; i >= 0; i--){
				int num = (int) cadena.charAt(i);
				if(num == 95){
					num = 91;
				}else if(num == 46){
					num = 92;
				}
				int aux = (num-65+ext)%28+65; //Movimiento clave
				if(aux == 91){
					aux = 95;
				}else if(aux == 92){
					aux = 46;
				}
				char a = (char) aux;
				reverse += a;
			}
			System.out.println(reverse);
		}
		
	}
}