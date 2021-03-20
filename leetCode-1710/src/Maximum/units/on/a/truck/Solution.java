package Maximum.units.on.a.truck;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		// example1
		// boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
		int[][] e1 = {{1,3} ,{2,2} ,{3,1}};
		int e11 = 4;
		
		
		// example2
		// Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
		// Output: 91
		int[][] e2 = {{5,10},{2,5},{4,7},{3,9}};
		int e22 = 10;
		
		// example33
		// [[2,1],[4,4],[3,1],[4,1],[2,4],[3,4],[1,3],[4,3],[5,3],[5,3]]
		// 13
		// output 48
		int[][] e3 = {{2,1},{4,4},{3,1},{4,1},{2,4},{3,4},{1,3},{4,3},{5,3},{5,3}};
		int e33 = 13;
		
		System.out.println(s.maximumUnits(e2, e22));
		
	}
	// Ver.6
	//
	
	
	// Ver.5
	// Runtime : 7 ms, 94.87%   
	// Memory  : 38.9 MB, 95.97%
	// result  : Arrays class sort method by Anonymous Class
	// comment : need to study more in various types' methods, it reduces Runtime much better.
	// learned : Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
	//                        list ,  a,b are the type of list -> return statement 
	//                       int[][], a&b int[] -> return statement
	
	public int maximumUnits(int[][] boxTypes, int truckSize) {
        
		Arrays.sort(boxTypes, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o2[1] - o1[1];
			}
        });
		
		int result = 0;
		
		for(int i = 0; i < boxTypes.length; i++) {

			if(truckSize >= boxTypes[i][0]) {
				
				result += (boxTypes[i][0] * boxTypes[i][1]);
				truckSize -= boxTypes[i][0];
				
			} else {
			
				result += (boxTypes[i][1] * truckSize);
				break;
				
			}
		}
	
		return result;
	}
		
	
	
	
	// Ver.4
	// Runtime : 7 ms, 94.87%   
	// Memory  : 39.1 MB, 77.24%
	// result  : Arrays class sort method by Lamda
	
//	public int maximumUnits(int[][] boxTypes, int truckSize) {
//		
//		// Arrays class contains various methods for manipulating arrays (such as sorting and searching).
//		// Arrays class also contains a static factory that allows arrays to be viewed as lists.
//
//		// [][]boxTypes -> a[] and b[]
//		// b[1] - a[1] -> descending order by int[]'s index 1
//		
//        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
//        
//        Arrays.sort(boxTypes, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				// TODO Auto-generated method stub
//				return o2[1] - o1[1];
//			}
//        });
//        
//		
//		int result = 0;
//		for(int i = 0; i < boxTypes.length; i++) {
//
//			int numOfBox = boxTypes[i][0];
//			int numOfUnit = boxTypes[i][1];
//			
//			if(truckSize >= numOfBox) {
//				result += (numOfBox * numOfUnit);
//				truckSize -= numOfBox;
//				
//			} else {
//				result += (numOfUnit * truckSize);
//				break;
//			}
//			
//			/* the same with above if,else statements */
//			
//			
////			result += (truckSize >= numOfBox ? (numOfBox * numOfUnit) : (numOfUnit * truckSize));
////			truckSize = (truckSize <= numOfBox ? 0 : truckSize - numOfBox );
////			if(truckSize == 0)
////				break;
//		}
//		
//		
//		return result;
//	}
	
	
	
	
	
	// Ver.3
	// Runtime : 25 ms, 14.88%   
	// Memory  : 39 MB, 91.25%
	// result1 : better in Memory usage, worse in Runtime
	
//	public int maximumUnits(int[][] boxTypes, int truckSize) {
//	
//		TreeMap<Integer, Integer> t = new TreeMap<>(Collections.reverseOrder());
//		int result = 0;
//		
//		for(int i = 0; i < boxTypes.length; i++) {
//			
//			if(t.containsKey(boxTypes[i][1])) {
//				
//				t.put(boxTypes[i][1], t.get(boxTypes[i][1]) + boxTypes[i][0]);
//			
//			}
//			else {
//				
//				t.put(boxTypes[i][1], boxTypes[i][0]);
//				
//			}
//			
//		}
//		
//		Object[] keys = t.keySet().toArray();
//		Object[] values = t.values().toArray();
//		
//		for(int i = 0; i < keys.length; i++) {
//			for(int j = (int)values[i]; j > 0; j--) {
//				result += (int)keys[i];
//					
//				if(--truckSize == 0) {
//					return result;
//				}		
//			}
//		}
//		
//	
//		return result;
//	}
	
	
	
	
	// Ver.2
	// Runtime : 15 ms,   30.41%   
	// Memory  : 39. MB, 68.45%
	// result1 : worse algorithm than ver1 to use getOrDefault() 
	
	//	public int maximumUnits(int[][] boxTypes, int truckSize) {
//		
////		HashMap : not supported Descending order by using reverseOrder() method
//		HashMap<Integer, Integer> h = new HashMap<>();
//		
//		TreeMap : supported Descending, ordered by key value;
//		TreeMap<Integer, Integer> t = new TreeMap<>(Collections.reverseOrder());
//		int result = 0;
//		
//		for(int i = 0; i < boxTypes.length; i++) {
//			
//			// using getOrDefault method
//			t.put(boxTypes[i][1], t.getOrDefault(boxTypes[i][1], 0) + boxTypes[i][0]);
//			
//		}
////		System.out.println(t);
////		System.out.println(t.keySet());
////		System.out.println(t.values());
//		
//		Object[] keys = t.keySet().toArray();
//		Object[] values = t.values().toArray();
//		
//		for(int i = 0; i < keys.length && truckSize != 0; i++) {
//			if(truckSize - (int)values[i] >= 0) {
//				result += ((int)keys[i] * (int)values[i]);
//				truckSize -= (int)values[i];
//			} else {
//				result += ((int)keys[i] * truckSize );
//				truckSize = 0;
//			}
//		}
//		
//		
//		return result;
//	}
	
	
	// Ver.1
	// Runtime : 14 ms,  34.77% - need refactoring for runtime faster.
	// Memory  : 39.1MB, 77.24%
//	public int maximumUnits(int[][] boxTypes, int truckSize) {
//		
////		HashMap : not supported Descending order by using reverseOrder() method
////		HashMap<Integer, Integer> h = new HashMap<>();
//		
////		TreeMap : supported Descending, ordered by key value;
//		TreeMap<Integer, Integer> t = new TreeMap<>(Collections.reverseOrder());
//		int result = 0;
//		
//		for(int i = 0; i < boxTypes.length; i++) {
//			
//			if(t.containsKey(boxTypes[i][1])) {
//				
//				t.put(boxTypes[i][1], t.get(boxTypes[i][1]) + boxTypes[i][0]);
//			
//			}
//			else {
//				
//				t.put(boxTypes[i][1], boxTypes[i][0]);
//				
//			}
//		}
//		
//		for(Map.Entry<Integer, Integer> entry : t.entrySet()) {
//			
//			if( truckSize - entry.getValue() >= 0) {
//					
//				result += (entry.getKey() * entry.getValue());
//				truckSize -= entry.getValue();
//			
//			} else {
//			
//				result += (entry.getKey() * truckSize);
//				truckSize = 0;
//			}
//
//		}
//		
//		return result;
//	}
	

	
//	public int maximumUnits(int[][] boxTypes, int truckSize) {
//        
//		ArrayList<Integer> units = new ArrayList<>();
//		
//		
//		for(int i = 0; i < boxTypes.length; i++) {
//			
//			units.add(boxTypes[i][1]);
//		}
//		
//		Collections.sort(units, Collections.reverseOrder());
//		
//		//System.out.println(units);
//		//Integer max = Collections.max(list); // will use this in version2
//		
//		int result = 0;
//		int temp = 0;
//		
//		for(int i = 0; i < units.size(); i++) {
//				
//			for(int j = 0; j < boxTypes.length; j++) {
//					
//				if(units.get(i) == boxTypes[j][1]) {
//					temp = boxTypes[j][0];
//					
//					for(int k = temp; k > 0 && truckSize > 0; k--) {
//						result += boxTypes[j][1];
//						System.out.println(result);
//						truckSize--;
//					}
//				}
//			}
//			
//		}
		
		
		
//		for(int i = 0; i < boxTypes.length; i++) {
//			
//			int temp = boxTypes[i][0];
//			
//			for(int j = temp; j > 0 && truckSize > 0; j--) {
//				
//				result += boxTypes[i][1];
//				truckSize--;
//			}
//		}
//		
//		return result;
//    }
	
}
