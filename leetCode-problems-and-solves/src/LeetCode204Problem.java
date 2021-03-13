import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode204Problem {

	public static void main(String[] args) {
		
//		System.out.println(countPrimes(4)); // 2 // 2, 3
////		System.out.println(countPrimes(5)); // 2 // 2, 3
//////
//		System.out.println(countPrimes(10)); // 4 // 2, 3, 5, 7
////		System.out.println(countPrimes(21)); // 8 // 2, 3, 5, 7, 11, 13, 17, 19
////
//		System.out.println(countPrimes(0)); // 0
//		System.out.println(countPrimes(1)); // 0
////
//		System.out.println(countPrimes(2)); // 0
//		System.out.println(countPrimes(3)); // 1
		long start = System.currentTimeMillis();
		System.out.println(countPrimes(499979)); // 41537
		long end = System.currentTimeMillis();
		System.out.println("runtime : " + (double) (end - start)/1000);


	}
	//Ver.1 - time limit exceeded
//	public static int countPrimes(int n) {
//        
//		LinkedList<Integer> primeNums = new LinkedList<>();
//		
//		if( n > 3) {
//			primeNums.add(2);
//			primeNums.add(3);
//			
//			for(int i = 5; i < n; i+=2) {
//				boolean flag = false;
//				int j;
//				
//				for(j = 0; j < primeNums.size(); j++) {
//					if(i % primeNums.get(j) == 0) {
//						flag = true;
//						break;
//					}
//				}
//				if(!flag)
//					primeNums.add(i);
//			}
//			System.out.println(primeNums);
//			return primeNums.size();
//		}else if(n > 2) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
	
//	// Ver.2 time limit exceeded
//	public static int countPrimes(int n) {
//        
//		ArrayList<Integer> primeNums = new ArrayList<>();
//		
//		int count = 0;
//		primeNums.add(2);
//		
//		
//		for(int i = 3; i < n; i+=2) {
//			for(int j = 0; j < primeNums.size(); j++) {
//				if(i % primeNums.get(j) == 0) {
//					break;
//				}
//				if(j +1 == primeNums.size() ) {
//					count++;
//					primeNums.add(i);
//				}
//			}
//		}
//		//System.out.println(primeNums);
//		if(n == 3) return 1;
//		return primeNums.size() == 1 ? 0 : count+1;
//    }
	/*
	 * 에라토스테네스의 체를 구하는 방식은
	 * 2부터 ~ N까지  증가하는 i 를 제외한 
	 * i 의 배수를 하나하나 지워가면서 N까지 도달했을때 남은 수가 소수라고 하는 것이다. 
	 */
	public static int countPrimes(int n) {
  
		boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, 0, n, true);
        
        for (int p = 2; p * p <= n; p++) {
            if (prime[p])
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
        }
        
        int ct = 0;
        
        for (int i = 2; i <= n; i++)
            if (prime[i])
                ct++;
        
        return ct;
	}
}
