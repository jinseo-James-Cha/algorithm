package sum;

public class SumZeroToNumber {

	public static void main(String[] args) {
		// sum 0 ~ 10
		System.out.println(recursion(10));
	}
	
	public static int recursion(int n) {
		
		if(n == 0)
			return 0;
		else
			return n + recursion(n-1);
	}

}
