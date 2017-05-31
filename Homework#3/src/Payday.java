//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #3 : Part 3: Managed Chaos

import java.util.Scanner;

public class Payday {
	public static void main(String[] args) {
		String employeeType;
		double managerSalary, hourlyWage, hoursWorked, weeklySales, piecesProduced, payPerPiece, grossPay, taxes, netPay;
		final double TAX_RATE = 0.125, COMMISSION_RATE = .057;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Choose employee type: (m) manager (h) hourly (c) commission (p) pieceworker: ");
		employeeType = input.next();
		
		if (employeeType.equals("m")){
		//prompts	
			System.out.print("Enter weekly salary: ");
			managerSalary = input.nextDouble();
		//calculations	
			taxes = TAX_RATE*managerSalary;
			netPay = managerSalary-taxes; 
		//prints	
			System.out.printf("Gross pay: $%.2f\n", (managerSalary));
			System.out.printf("Taxes: $%.2f\n", (taxes));
			System.out.printf("Net pay: $%.2f\n", (netPay));
		}
		else if (employeeType.equals("h")){
		//prompts	
			System.out.print("Enter hourly wage: ");
			hourlyWage = input.nextDouble();
			System.out.print("Enter hours worked: ");
			hoursWorked = input.nextDouble();
		//calculations
			if (hoursWorked>35){
				grossPay = hourlyWage*35 + hourlyWage*2*(hoursWorked-35);
			}
			else{
				grossPay = hourlyWage*hoursWorked;
			}
			taxes = TAX_RATE*grossPay;
			netPay = grossPay-taxes; 
		//prints	
			System.out.printf("Gross pay: $%.2f\n", (grossPay));
			System.out.printf("Taxes: $%.2f\n", (taxes));
			System.out.printf("Net pay: $%.2f\n", (netPay));	
		}
		else if (employeeType.equals("c")){
		//prompts		
			System.out.print("Enter weekly sales: ");
			weeklySales = input.nextDouble();
		//calculations	
			grossPay = 250 + COMMISSION_RATE*weeklySales;
			taxes = TAX_RATE*grossPay;
			netPay = grossPay-taxes; 
		//prints	
			System.out.printf("Gross pay: $%.2f\n", (grossPay));
			System.out.printf("Taxes: $%.2f\n", (taxes));
			System.out.printf("Net pay: $%.2f\n", (netPay));
		}
		else if (employeeType.equals("p")){
		//prompts	
			System.out.print("Enter pieces produced: ");
			piecesProduced = input.nextDouble();	
			System.out.print("Enter pay per piece: ");
			payPerPiece= input.nextDouble();
		//calculations		
			grossPay = piecesProduced*payPerPiece;
			taxes = TAX_RATE*grossPay;
			netPay = grossPay-taxes; 
		//prints	
			System.out.printf("Gross pay: $%.2f\n", (grossPay));
			System.out.printf("Taxes: $%.2f\n", (taxes));
			System.out.printf("Net pay: $%.2f\n", (netPay));
		}
		else {
			System.out.print("Employee type invalid.");
		}
	}
}	