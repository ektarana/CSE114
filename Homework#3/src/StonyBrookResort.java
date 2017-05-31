//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #3 : Part 2: What A View! Wait, What’s That Smell?
import java.util.Scanner;

public class StonyBrookResort {
	public static void main(String[] args) {
		
		int adult, child, numberOfDays;
		final int ADULT_PRICE = 125;
		final int CHILD_PRICE = 75;
		double price=0, discount=0, serviceCharge = 0;
		String dayOfWeek; 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of adults: ");
		adult = input.nextInt();
		System.out.print("Enter number of children: ");
		child = input.nextInt();
		System.out.print("Enter length of vacation in days: ");
		numberOfDays = input.nextInt();
		System.out.print("Enter day of week that vacation starts: ");
		dayOfWeek = input.next();
		
		dayOfWeek = dayOfWeek.substring(0,1).toUpperCase() + dayOfWeek.substring(1, dayOfWeek.length()).toLowerCase();
		price = (adult*ADULT_PRICE + child*CHILD_PRICE)*numberOfDays;

		if ((dayOfWeek.equals("Monday")) && (numberOfDays<5)){
			discount = discount + 150;
		}
		if (numberOfDays>5){
			discount = (adult*((double)(numberOfDays-5))*31.25);	
		}
		if (adult+child>=6){
			serviceCharge = price*.05;
		}
	
		System.out.printf("Total before discounts: $%.2f\n", (price));
		System.out.printf("Discounts: $%.2f\n", (discount));
		System.out.printf("Service charges: $%.2f\n", (serviceCharge));
		System.out.printf("Grand total: $%.2f\n", ((price+serviceCharge-discount)));	
	}
}
