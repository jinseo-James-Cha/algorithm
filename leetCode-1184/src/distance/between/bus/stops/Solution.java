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
		System.out.println(s.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
		
		/*
		 * Input: distance = [1,2,3,4], start = 0, destination = 2
		 * Output: 3
		 * Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
		 */
//		System.out.println(s.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 2, 3));

	}
	
	 public int distanceBetweenBusStops(int[] distance, int start, int destination) {
	 
		 int clockWise = 0;
		 int CounterClockWise = 0;
		 int minimum = 0;
		 
		 //ClockWise
//		 for( int i = start; i < destination ; i++) {
//			 
//			 clockWise += distance[i];
//		 }
			 
//		 //CounterClockWise
//		 for( int i = start;  ;  i++ ) {
//			 
//			 clockWisse++;
//			 
//			 
//		 }
		 
		 
		 return minimum;
	 }

}
