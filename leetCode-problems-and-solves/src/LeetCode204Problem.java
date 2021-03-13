import java.util.ArrayList;
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
	
	
	public static int countPrimes(int n) {
        
		ArrayList<Integer> primeNums = new ArrayList<>();
		
		int count = 0;
		primeNums.add(2);
		
		
		for(int i = 3; i < n; i+=2) {
			for(int j = 0; j < primeNums.size(); j++) {
				if(i % primeNums.get(j) == 0) {
					break;
				}
				if(j +1 == primeNums.size() ) {
					count++;
					primeNums.add(i);
				}
			}
		}
		//System.out.println(primeNums);
		if(n == 3) return 1;
		return primeNums.size() == 1 ? 0 : count+1;
    }
}
