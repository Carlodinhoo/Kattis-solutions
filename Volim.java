import java.util.*;

public class Volim{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int jugador = sc.nextInt();
		int preguntas = sc.nextInt();
		int segundos;
		int total = 0;
		String tipo;

		for(int i = 0; i < preguntas; i++){
			segundos = sc.nextInt();
			tipo = sc.next();
			total = total+segundos;
			if(total <= 210){
				if("T".equals(tipo)){
					jugador++;
					if(jugador == 9){
						jugador = 1;
					}
				}
			}
			
		}

		System.out.println(jugador);
	}
}