package fibonacci.numbers;

public class Solution {

	public static void main(String[] args) {

		System.out.println(fib(3));
	}

	// Ver.1
	// Runtime  : 6 MS, 29.08%
	// Memory   : 35.6MB, 83.52%
	// comment  : need to have a solution to reduce Runtime
	public static int fib(int n) {
        if(n <= 1)
        	return n;
        else
        	return fib(n-1) + fib(n-2);
		
    }
}
