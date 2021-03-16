package fibonacci.numbers;

public class FibonacciSequence {

	public static void main(String[] args) {

		// if n > 0,
		// F(n) = F(n-1) + F(n-2)
		// 1 2 3 5 8 13 21 34.....
		
		// 8 = 5 + 3
		System.out.println(fibonacci(8));
		
	}
	
	public static int fibonacci(int n) {
		if(n < 2)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
