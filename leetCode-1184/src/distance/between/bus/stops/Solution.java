package distance.between.bus.stops;

public class Solution {

	public static void main(String[] args) {

		/*
		 * A bus has n stops numbered from 0 to n - 1 that form a circle. 
		 * We know the distance between all pairs of neighboring stops 
		 * where distance[i] is the distance between the stops number i and (i + 1) % n.
         * The bus goes along both directions i.e. clockwise and counterclockwise.
         * Return the shortest distance between the given start and destination stops.
		 */
		
		/*
		 * Example
		 * Input: distance = [1,2,3,4], start = 0, destination = 1
         * Output: 1
         * Explanation: Distance between 0 and 1 is 1 or 9, minimum is 1.
		 */
		
		Solution s = new Solution();
//		System.out.println(s.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
		
		/*
		 * Input: distance = [1,2,3,4], start = 0, destination = 2
		 * Output: 3
		 * Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
		 */
//		System.out.println(s.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 2, 3));

		
		
		
		/*
		 * Input: distance = [7,10,1,12,11,14,5,0], start = 7, destination = 2
		 * Output: 17
		 * Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
		 */
		
		System.out.println(s.distanceBetweenBusStops(new int[]{7,10,1,12,11,14,5,0}, 7, 2));

				
	}
	
	
	 // Ver.1
	 // Runtime : 0 ms, faster than 100% of other's solutions   
	 // Memory  : 39.1 MB, less than 21.24% of other's solutions 
	 // Comment : need to improve on memory usage.
	 public int distanceBetweenBusStops(int[] distance, int start, int destination) {
	 
		 int clockWise = 0;
		 int counterClockWise = 0;
		 int sum = 0;
		 
		 // sum of all distances
		 for(int i = 0; i < distance.length; i++) {
			 sum += distance[i];
		 }
		 
		 // distance of ClockWise
		 if( start < destination)
			 for( int i = start; i < destination ; i++) {
				 
				 clockWise += distance[i];
			 }
		 else {
			 for( int i = start - 1; i >= destination; i--) {
				 clockWise += distance[i];
			 }
			 
		 }
		// distance of counter Clockwise 
		counterClockWise = sum - clockWise;
		 
		return clockWise >= counterClockWise ? counterClockWise : clockWise;
	 }

}
