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
		
		
	}
	
	 public int distanceBetweenBusStops(int[] distance, int start, int destination) {
	 
		
		 int result = distance[start] + distance[destination];
		 
		 
		 return result;
	 }

}
