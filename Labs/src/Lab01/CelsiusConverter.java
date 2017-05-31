package Lab01;
//Ekta Rana
//SBU ID: 111030624
//CSE 114

import java.util.Scanner;

public class CelsiusConverter {
	public static void main(String[] args) {
		
		double celsius, fahrenheit;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Celsius: ");
		celsius = input.nextDouble(); 
		
		fahrenheit = (9.0/5) * celsius + 32;
		
		System.out.print(celsius + " in Celsius is "+ fahrenheit + " in Fahrenheit.");
	
		input.close();
	}

}
