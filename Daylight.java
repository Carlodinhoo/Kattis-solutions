import java.util.*;

public class Daylight{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		String mes;
		int dia;
		int anio;
		String amanecer;
		String anochecer;
		
		int cont= 0;
		while(cont <= 7){
			mes = sc.next();
			dia = sc.nextInt();
			anio = sc.nextInt();
			amanecer = sc.next();
			anochecer = sc.next();
			String[] numeros = amanecer.split(":");
			String[] numeros2 = anochecer.split(":");
			String hora = numeros[0];
			String hora2 = numeros2[0];
			String minutos = numeros[1];
			String minutos2 = numeros2[1];
			int hora3 = Integer.parseInt(hora);
			int hora4 = Integer.parseInt(hora2);
			int minutos3 = Integer.parseInt(minutos);
			int minutos4 = Integer.parseInt(minutos2);
			int horas = hora4-hora3;
			int minuto = minutos4-minutos3;

			System.out.println(mes+" "+dia+" "+anio+" "+horas+" hours "+minuto+" minutes");
			cont++;
		}

		
		
	}
}