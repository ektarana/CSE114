package Lab02;

//Ekta Rana
//SBU ID: 111030624
//CSE 114
//Lab #2 : ChangeMaker

import java.util.Scanner;

public class ChangeMaker {
	public static void main(String[] args) {
		double price, from, change, coinchange;  
		int intprice, bill20, bill10, bill5, bill1, quarter, dime, nickel, penny;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Price: ");
		price = input.nextDouble();
		System.out.print("From: ");
		from = input.nextDouble();

//finds out what the total change amount should be		
		change = from - price; 
		
	//gets the dollar value of the price (without the cents)
		intprice = (int)(change); 
	//gets the coin value
		coinchange = change - intprice; 
		
		System.out.println("Computed change: $" + change); 
	
	//bill calc
		bill20 = (intprice/20); 
		intprice %= 20;
		bill10 = (intprice/10);
		intprice %= 10;
		bill5 = (intprice/5);
		intprice %= 5;
		bill1 = (intprice/1);
		intprice %= 1;
		
	//coin calc
		quarter = (int) (coinchange/0.25);
		coinchange %= .25;
		dime = (int) (coinchange/0.10);
		coinchange %= .10;
		nickel = (int) (coinchange/0.05);
		coinchange %= .05;
		penny = (int) (coinchange/0.01);
		coinchange %= .01;
		
		System.out.println(bill20 + " x $20 bills");
		System.out.println(bill10 + " x $10 bills");
		System.out.println(bill5 + " x $5 bills");
		System.out.println(bill1 + " x $1 bills");
		System.out.println(quarter + " x quarters");
		System.out.println(dime + " x dimes");
		System.out.println(nickel + " x nickels");
		System.out.println(penny + " x pennies");	
	
	input.close();
	}
}