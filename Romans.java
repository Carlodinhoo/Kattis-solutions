import java.util.*;
import java.math.*;

public class Romans{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double res = n*(5280/4854)*1000+0.5;
		BigDecimal big = new BigDecimal(res);
		big = big.setScale(4, RoundingMode.HALF_UP);
		int d2 = big.intValue();
		d2 += 0.5;

		System.out.print(d2);
	}
}