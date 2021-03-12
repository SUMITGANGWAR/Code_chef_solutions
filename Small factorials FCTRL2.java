import java.math.BigInteger;
import java.util.*;

class Main {
 
	public static void main (String[] args) {
		Scanner f=new Scanner(System.in);
		int T=f.nextInt();
		for(int tt=0; tt<T; tt++) {
			int n=f.nextInt();
			BigInteger fac = BigInteger.ONE;
		    for (int i = 2; i <= n; ++i)
		      fac = fac.multiply(BigInteger.valueOf(i));  
		    System.out.println(fac);
		}
	}
}
