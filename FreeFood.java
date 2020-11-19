import java.util.*;

public class FreeFood{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int eventos = sc.nextInt();
		List<Integer> lista_dias = new ArrayList<Integer>();
		int numeros_dias = 0; 

		while(eventos > 0){
			int s = sc.nextInt();
			int t = sc.nextInt();

			for(int i = s; i <= t; i++){
				if(lista_dias.isEmpty()){
					lista_dias.add(i);
					numeros_dias++;
				}else{
					if(!lista_dias.contains(i)){
						lista_dias.add(i);
						numeros_dias++;
					}
				}

			}
			eventos--;
		}

		System.out.println(numeros_dias);
		
	}
}