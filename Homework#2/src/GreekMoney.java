//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #2 : Part 3 : Show me the Money 

import java.util.Scanner;

public class GreekMoney {
	public static void main(String[] args) {
		
		int originalAmount, oboloi, minae, talents, drachmae, rem; 
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter number of oboloi: ");
		originalAmount = input.nextInt();
		
		System.out.println("That number of oboloi is equal to: " );
		
		talents = originalAmount/25200; 
		rem = originalAmount%25200;
		minae = rem/420; 
		rem = rem%420;
		drachmae = rem/6;
		rem = rem%6;
		oboloi = rem; 
		
		System.out.println("talents " + talents);
		System.out.println("minae " + minae);
		System.out.println("drachmae " + drachmae);
		System.out.println("oboloi " + oboloi);
		
}
}