package factorial;

public class MultipleZeroToNumber {

	public static void main(String[] args) {
		
		//multiple 0 ~ 3
		System.out.println(factorial(3));
	}
	
	public static int factorial(int n) {
		if(n == 0)
			return 1;
		else
			return n * factorial(n-1);
	}

}
