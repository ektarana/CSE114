public class Printing {

	public static void main(String[] args) {
		//printDiamond(9);
		//printN(5);
		hourGlass(7);
	}
	
	public static void printDiamond(int n){
		for (int j = n/2; j > 0; j--) {
			//spaces before the first star
			for (int i = 0; i < j; i++) {
				System.out.print(" "); 
			}
			
			//first star
			System.out.print("*"); 
			
			//spaces btwn the stars
			for(int i = 0; i<n-(2*j); i++){ 
				System.out.print(" ");
			}
			//second star
				System.out.println("*");
		}

		for (int j = 1; j <= n / 2; j++) {
			for (int i = 0; i < n - (2 * j); i++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	
	public static void printN(int n){
		String spaces = "";
		if (n == 0)
			System.out.println("");
		System.out.println("N" + "   " + "N"); // n-2 spaces
		System.out.println("N" + "N"+ "  " + "N"); // n-2 Ns
		System.out.println("N" + " " + "N"+ " " + "N"); // 
		System.out.println("N"+ "  " + "N" + "N");
		System.out.println("N" + "   " + "N");
	}

	/////hourglass


	/*LOGIC
	 * print n stars
	 *  print the row number of spaces 
	 *  print star
	 *  print spaces
	 */

	public static void hourGlass(int max){
		printBar(max);
		printMid(max, 1);
		printBar(max);	
	}
	public static void printBar(int max){
		for (int i = 0; i< max; i++){
			System.out.print("*");
			}
	}
	public static void printMid(int max, int row){
		if(row == max) return; 
		for (; row< max; row++){
			for(int i = 0; i < row; i++){
			System.out.print(" ");
			System.out.println("*");
			}
			int remSpaces = max/2 - 1 - row; 
			for(int i = 0; i< remSpaces; i++){
				System.out.print(" ");
			}
		}
	}

	

	

	

	
	
	
	
}