package woter.bottles;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Constraints
		 * 
		 * 1 <= numBottles <= 100
		 * 2 <= numExchange <= 100
		 * 
		 * */
		
		/*
		 * Problems instruction
		 * 
		 * Given numBottles full water bottles, 
		 * you can exchange numExchange empty water bottles for one full water bottle.
         * The operation of drinking a full water bottle turns it into an empty bottle.
         * Return the maximum number of water bottles you can drink.
		 */
		
		Solution s = new Solution();
		
		System.out.println(s.numWaterBottles(9, 3));
		//output : 13
		
		System.out.println(s.numWaterBottles(15, 4));
		//output : 19
		
		System.out.println(s.numWaterBottles(5, 5));
		//output : 6
		
		System.out.println(s.numWaterBottles(2, 3));
		//output : 2
		
	}
	
	public int numWaterBottles(int numBottles, int numExchange) {
        
		
		return 0;
    }

}
