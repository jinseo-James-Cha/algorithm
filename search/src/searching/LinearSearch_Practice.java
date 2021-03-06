package searching;

public class LinearSearch_Practice {

	public static void main(String[] args) {
		
		//test cases
		System.out.println(lengthOfLastWord("Hello World")); // 5
		
		System.out.println(lengthOfLastWord("Hello World java ")); // 4

		System.out.println(lengthOfLastWord("           ")); // 0

		System.out.println(lengthOfLastWord(" ")); // 0

		System.out.println(lengthOfLastWord("a")); // 1


	}
	/*	Ver.1
	*	Runtime: 1 ms
	*   Memory Usage: 37.4 MB
	*
	*	public static int lengthOfLastWord(String s) {
	*      String[] sarry = s.split(" "); 
	*		if(sarry.length == 0)
	*			return 0;
	*		return sarry[sarry.length-1].length();
	*	}
	*/
	
	
	
   /*	Ver.2
	*   Runtime: 1 ms
	*   Memory Usage: 37.3 MB
	*   
	*	public static int lengthOfLastWord(String s) {
	*        String[] sarry = s.split(" ");
	*        int i = sarry.length;
	*		if(i == 0)
	*			return i;
	*		return sarry[i-1].length();
	*	}
	*/

	/*	Ver.3
	 *	Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
	 *	Memory Usage: 37.2 MB, less than 82.43% of Java online submissions for Length of Last Word.
	 */
		 public static int lengthOfLastWord(String s) {
					
				char[] carry = s.trim().toCharArray();
					
				int i = 0;
				int count = 0;
				if( carry.length > 0) {
					for(i = carry.length - 1; i > 0; i--) {
						if(carry[i] == ' ') {
							count++;
							if( i == carry.length - 1) {
								continue;
							} else {
								break;
							}
						}
					}
				}
				else {
					return 0;
				}
		
				return (carry.length - count) - i;
			}
}
