package euclid.method;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// Greatest Common Divisor
		// if m >= n,
		// 1. if m is multiplied of n, n is GCD
		// 2. if not, GCD(n, m%n)
		
		System.out.println(euclidMethod2(16, 4));
		
	}
	public static int euclidMethod2(int m, int n) {
		
		if(n == 0)
			return m;
		else
			return euclidMethod2(n, m%n);
	}

	
	public static int euclidMethod(int m, int n) {
		if( m < n ) {
			//swap m and n
			int temp = m;
			m = n;
			n = temp;
		}
		
		if(m%n == 0)
			return n;
		else
			return euclidMethod(n, m%n);
	}
}
