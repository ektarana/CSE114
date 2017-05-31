package Lab05;
/*Write the following method to display an integer in reverse order with the following
 *  method signature: public static void reverse(int number)
 */

public class Reverse {
	public static void main (String[] args){
		int revNum = 12345;
		reverse(revNum);
	}
	
	public static void reverse (int num){
		String s = Integer.toString(num); 
//		String answer = " ";
		for(int i=0; i<s.length(); i++){
			System.out.print	(s.length()-i);
		}
	
	}
}