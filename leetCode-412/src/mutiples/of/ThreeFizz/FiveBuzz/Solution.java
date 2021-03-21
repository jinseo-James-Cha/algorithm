package mutiples.of.ThreeFizz.FiveBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		/*
		 * Write a program that outputs the string representation of numbers from 1 to n.
		 * But for multiples of three it should output “Fizz” 
		 * instead of the number and for the multiples of five output “Buzz”. 
		 * For numbers which are multiples of both three and five output “FizzBuzz”.
		 */
		
		System.out.println(new Solution().fizzBuzz(15));
		
	}
	
	// Ver.1
	// Runtime : 1 ms    99.77%
	// Memory  : 39.8 MB 91.80%
	
	public List<String> fizzBuzz(int n){
		
		List<String> result = new ArrayList<>();
		String fizz = "Fizz";
		String buzz = "Buzz";
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				result.add(fizz + buzz);
				continue;
			}
			if(i % 3 == 0) {
				result.add(fizz);
				continue;
			}
			if(i % 5 == 0) {
				result.add(buzz);
				continue;
			}
			result.add(Integer.valueOf(i).toString());
		}
		
		return result;
	}
	
	

}
