import java.util.*;

public class OddMan{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		int cont = 1;
		Set<Integer> lista = new HashSet<>();

		for(int i = 0; i < g; i++){
			int c = sc.nextInt();
			for(int j = 0; j < c; j++){
				int guest_number = sc.nextInt();
				if(lista.contains(guest_number)){
					lista.remove(guest_number);
				}else{
					lista.add(guest_number);
				}
			}

			if(!lista.isEmpty()){
				for (Integer x : lista) {
					System.out.println("Case #"+cont+": "+x);
					cont++;	
				}
			}
			lista.clear();
		}

	}
}