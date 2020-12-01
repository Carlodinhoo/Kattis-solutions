import java.util.*;

public class BoatParts{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();

		int partes = sc.nextInt();
		int dias = sc.nextInt();
		int resultado = 0;
		int restantes = 0;

		for(int i = 0; i < dias; i++){
			String cadena = sc.next();
			if(!lista.contains(cadena) && restantes < partes){
				lista.add(cadena);
				restantes++;
				resultado++;
			}else if(restantes < partes){
				resultado++;
			}

		}

		if(resultado == dias && restantes < partes){
			System.out.println("paradox avoided");
		}else{
			System.out.println(resultado);
		}
	}
}