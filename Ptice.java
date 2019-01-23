import java.util.*;

public class Ptice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String cadena = sc.next();
		String respuestasA = "";
		String respuestasB = "";
		String respuestasG = "";
		String adrian = "ABC";
		String bruno = "BABC";
		String goram = "CCAABB";
		int a = 0;
		int b = 0;
		int g = 0;
		while(n > 0){
			if(a == adrian.length()){
				a = 0;
			}
			if(b == bruno.length()){
				b = 0;
			}
			if(g == goram.length()){
				g = 0;
			}	
			respuestasA += adrian.charAt(a);
			respuestasB += bruno.charAt(b);
			respuestasG += goram.charAt(g);
			a++;
			b++;
			g++;
			n--;
		}
		int puntajeA = 0;
		int puntajeB = 0;
		int puntajeG = 0;
		for(int i = 0; i < cadena.length(); i++){
			if(respuestasA.charAt(i) == cadena.charAt(i)){
				puntajeA++;
			}
			if(respuestasB.charAt(i) == cadena.charAt(i)){
				puntajeB++;
			}
			if(respuestasG.charAt(i) == cadena.charAt(i)){
				puntajeG++;
			}
		}

		if(puntajeA > puntajeB && puntajeA > puntajeG){
			System.out.println(puntajeA);
			System.out.println("Adrian");
		}else if(puntajeB > puntajeA && puntajeB > puntajeG){
			System.out.println(puntajeB);
			System.out.println("Bruno");
		}else if(puntajeG > puntajeA && puntajeG > puntajeB){
			System.out.println(puntajeG);
			System.out.println("Goram");	
		}else if(puntajeA == puntajeB && puntajeA != puntajeG){
			System.out.println(puntajeA);
			System.out.println("Adrian");
			System.out.println("Bruno");
		}else if(puntajeA == puntajeG && puntajeA != puntajeB){
			System.out.println(puntajeA);
			System.out.println("Adrian");
			System.out.println("Goram");
		}else if (puntajeB == puntajeG && puntajeB != puntajeA){
			System.out.println(puntajeB);
			System.out.println("Bruno");
			System.out.println("Goram");
		}else{
			System.out.println(puntajeA);
			System.out.println("Adrian");
			System.out.println("Bruno");
			System.out.println("Goram");
		}
	}
}