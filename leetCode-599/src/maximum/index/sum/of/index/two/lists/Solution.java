package maximum.index.sum.of.index.two.lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
//		// output : Shogun
//		
		String[] list3 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list4 = new String[] {"KFC","Shogun","Burger King"};
//		// output : Shogun / sum index : 0+1
//		
		String[] list5 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list6 = new String[] {"KFC","Burger King","Tapioca Express","Shogun", "hollys" , "starbucks"};
//		// output : "KFC","Burger King","Tapioca Express","Shogun" 
//		// sum index : 3+0, 2+1, 1+2, 0+3
//		// arraylist index priority by first list index if sum is equal
//		
		String[] list7 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list8 = new String[] {"KNN","KFC","Burger King","Tapioca Express","Shogun"};
//		// output : "KFC","Burger King","Tapioca Express","Shogun"
//		// sum index : 3+1, 2+2, 1+3, 0+4
//		// less sum index, early in the output 
//		
		String[] list9 = new String[] {"KFC"};
		String[] list10 = new String[] {"KFC"};
		// output : "KFC"
		
		String[] list11 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list12 = new String[] {"KFC","Shogun","Burger King"};
//		//output : shogun
//
		String[] list13 = new String[] {"k", "KFC"};
		String[] list14 = new String[] {"k", "KFC"};
		//output : k
		
		//case 1
		for(String str : s.findRestaurant(list5, list6)) {
			System.out.println(str);
		}
	}

	/*
	 * save only the common restaurant between list1 and list2
	 * need to compare sum index of those common restaurant searched
	 * 
	 * key points 
	 * 1. if the sum is equal, sort by list2's index ascending
	 * 2. if the sum is different, only print the minimum number of sum
	 * */
	
	// Ver 3
	// Runtime 7ms
	// Memory 39.8 MB
	// HashMap has key(String) and value(Integer)
	// it has advantage of searching key by using containsKey(key)
	public String[] findRestaurant(String[] list1, String[] list2) {
        
		// Using HashMap
		Map<String, Integer> list1Map = new HashMap<>();
		ArrayList<String> resultArray = new ArrayList<>();
		
		for(int i = 0; i < list1.length; i++) {
			list1Map.put(list1[i], i);
		}
		
		int minSum = list1.length + list2.length;
		
		for(int i = 0; i < list2.length; i++) {
			
			if(list1Map.containsKey(list2[i])) {
				
				int temp = list1Map.get(list2[i]) + i;
				
				if( minSum > temp) {
					// minimum sum changed
					minSum = temp;

					// clear saved values previously
					resultArray.clear();
					
					resultArray.add(list2[i]);
					
				} else if( minSum == temp ) {
					
					resultArray.add(list2[i]);
				}
			}
		}
		
		// transfer ArrayList's saved values to String[]
		String[] result = new String[resultArray.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = resultArray.get(i);
		}
		
		return result;
	}
	
	
	// Ver2
	// Runtime 87ms
	// Memory 39.9MB
//	public String[] findRestaurant(String[] list1, String[] list2) {
//        
//		ArrayList<String> result = new ArrayList<>();
//		
//		int sumOfIndex = list1.length + list2.length;
//		int count = 0;
//		
//		for(int i = 0; i < list2.length; i++) {
//			for(int j = 0; j < list1.length; j++ ) {
//				
//				if(list2[i].equals(list1[j])){
//					
//					if(sumOfIndex > i+j) {
//						
//						result.clear();
//						result.add(list2[i]);
////						count = 1;
//						sumOfIndex = i+j;
//						
//					} else if(sumOfIndex == i+j) {
//						
////						count++;
//						result.add(list2[i]);
//						
//					} else if(sumOfIndex < i + j) {
//						
//						break;
//						
//					}
//				}
//			}
//		}
//		System.out.println(result);
//		
////		System.out.println(sumOfIndex);
////		System.out.println(count);
//
//		return result.toArray(new String[result.size()]);
//	}
	
	
	
	
	// Ver.1 
	// Runtime 96ms
	// Memory 39.5MB
	// need a code re-factoring
//	public String[] findRestaurant(String[] list1, String[] list2) {
//	        
//		//String[] result = new String[list1.length];
//		ArrayList<String> strArray = new ArrayList<>(list1.length);
//		
//		int sumOfIndex = 0;
//		boolean isEmpty = true;
//		
//		for(int i = 0; i < list2.length; i++) {
//			
//			for(int j = 0; j < list1.length; j++ ) {
//				
//				if(list2[i].equals(list1[j])){
//					
//					if( isEmpty) {
//						strArray.add(list2[i]);
//						isEmpty = false;
//						sumOfIndex = i+j;
//					}
//					else if(sumOfIndex == i+j) {
//						strArray.add(list2[i]);
//					}
//					else if(sumOfIndex > i+j) {
//						strArray.clear();
//						strArray.add(list2[i]);
//					}
//				}
//			}
//		}
//		
//		return strArray.toArray(new String[strArray.size()]);
//	}
//	
//	
	
	
}
