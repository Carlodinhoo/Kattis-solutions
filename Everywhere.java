import java.util.*;

public class Everywhere{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int viajes = sc.nextInt();
		int cont = 0;
		List<String> lista_ciudades = new ArrayList<>();

		while(viajes != 0){
			int ciudades = sc.nextInt();
			while(ciudades != 0){
				String city = sc.next();
				if(!lista_ciudades.contains(city)){
					lista_ciudades.add(city);
				}
				ciudades--;
			}
			System.out.println(lista_ciudades.size());
			lista_ciudades.clear();
			viajes--;
		}
		
		/* Ways of iterate a list
		for (String a : lista_ciudades) {
			System.out.println(a);
		}
		*/

	}
}