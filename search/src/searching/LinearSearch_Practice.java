package searching;

public class LinearSearch_Practice {

	public static void main(String[] args) {
		
		// test cases
//		System.out.println(lengthOfLastWord("Hello World")); // 5
//		System.out.println(lengthOfLastWord("Hello World java ")); // 4
//
//		System.out.println(lengthOfLastWord("           ")); // 0

		System.out.println(lengthOfLastWord(" ")); // 0

		//System.out.println(lengthOfLastWord("a")); // 1


	}
	//Ver.1
	public static int lengthOfLastWord(String s) {
		
		char[] carry = s.toCharArray();
		
		int i = 0;
		int count = 0;
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
		System.out.println(carry.length);
		System.out.println(count);
		System.out.println(i);

		return (carry.length - count) - i;
	}
	
	
//	//Ver.2
//	public static int lengthOfLastWord(String s) {
//        String[] sarry = s.split(" ");
//        int i = sarry.length;
//		if(i == 0)
//			return i;
//		return sarry[i-1].length();
//	}
	
//	//Ver.3
//	public static int lengthOfLastWord(String s) {
//      String[] sarry = s.split(" "); 
//		if(sarry.length == 0)
//			return 0;
//		return sarry[sarry.length-1].length();
//	}
}
