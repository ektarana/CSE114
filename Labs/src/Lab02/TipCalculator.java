package Lab02;

import java.util.Scanner; 

public class TipCalculator {
	public static void main(String[] args) {
		double subtotal, tip, finalTotal;
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the subtotal: $");
		subtotal = input.nextDouble(); 
		
		if(subtotal < 30.0){
			finalTotal = 5.0 + subtotal; 
			System.out.print("The gratuity is: $5 and the total is $" + finalTotal );
		}else{
			tip = 0.15*subtotal;
			finalTotal = subtotal + tip; 
			System.out.print("The gratuity is: $" + tip + " and the total is $");
			System.out.printf("%.2f", finalTotal);
		}
		input.close();
	}
}