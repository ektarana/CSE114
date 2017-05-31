package Lab03;

import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		
		double hours, payRate, federalTax, stateTax; 
		String name; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name : ");
		name = input.next();

		System.out.print("Enter number of hours worked in a week: ");
		hours = input.nextDouble();
						 
		System.out.print("Enter hourly pay rate: ");
		payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate (%): ");
		federalTax = input.nextDouble();
						 
		System.out.print("Enter state tax withholding rate (%): ");
		stateTax = input.nextDouble();
				 
	//calc total pay
		double totalPaycheck;
		totalPaycheck = (hours*payRate)*(1-(stateTax+federalTax)/100);
		
		System.out.println("Name: " + name);
		System.out.println("Worked " + hours + " this week." );
		System.out.println("Hourly pay rate: " + payRate);			
		System.out.println("Federal tax withholding rate: " + federalTax + "%");
		System.out.println("State tax withholding rate: " + stateTax+  "%");
		System.out.println("Your total pay check is: " + totalPaycheck);
	
		input.close();
	}
}