package maximum.index.sum.of.index.two.lists;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		// output : Shogun
		
		String[] list3 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list4 = new String[] {"KFC","Shogun","Burger King"};
		// output : Shogun / sum index : 0+1
		
		String[] list5 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list6 = new String[] {"KFC","Burger King","Tapioca Express","Shogun", "hollys" , "starbucks"};
		// output : "KFC","Burger King","Tapioca Express","Shogun" 
		// sum index : 3+0, 2+1, 1+2, 0+3
		// arraylist index priority by first list index if sum is equal
		
		String[] list7 = new String[] {"KFC","Burger King","Tapioca Express","Shogun"};
		String[] list8 = new String[] {"KNN","KFC","Burger King","Tapioca Express","Shogun"};
		// output : "KFC","Burger King","Tapioca Express","Shogun"
		// sum index : 0+1, 1+2, 2+3, 3+ 4
		// less sum index, early in the output 
		
		String[] list9 = new String[] {"KFC"};
		String[] list10 = new String[] {"KFC"};
		// output : "KFC"
		
//		String[] list11 = new String[] {"KFC","Burger King","Tapioca Express","Shogun"};
//		String[] list12 = new String[] {"KFC","Burger King","Tapioca Express","Shogun"};
//		

		
		//case 1
		for(String str : s.findRestaurant(list7, list8)) {
			System.out.println(str);
		}
	}

	/*
	 * save only the common restaurant between list1 and list2
	 * need to compare sum index of those common restaurant searched
	 * 
	 * key points 
	 * 1. if the sum is equal, sort by list1's index descending or list2's index ascending
	 * 2. if the sum is not equal, sort by the index sum ascending
	 * */
	
	public String[] findRestaurant(String[] list1, String[] list2) {
	        
		//String[] result = new String[list1.length];
		ArrayList<String> strArray = new ArrayList<>(list1.length);
		
		for(int i = 0; i < list1.length; i++) {
			for(int j = 0; j < list2.length; j++ ) {
				if(list1[i].equals(list2[j])){
					strArray.add(list1[i]);
				}
			}
		}
		
		System.out.println(strArray);
		return strArray.toArray(new String[strArray.size()]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
