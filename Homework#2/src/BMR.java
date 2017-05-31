//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #2 : Part 4 : Basal Metabolic Rate

import java.util.Scanner;

public class BMR {
	public static void main(String[] args) {	
		
	int  age;
	double mass, height, bmrMan, bmrWoman;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the person’s weight in pounds: ");
	mass = input.nextDouble();
	System.out.print("Enter the person’s weight in pounds: ");
	height = input.nextDouble();
	System.out.print("Enter the person’s age: ");
	age = input.nextInt();
	
	mass = mass*0.45359237;
	height = height*2.54;
	
	bmrMan = ((10.0*mass) + (6.25*height)-(5*age) + 5);
	bmrWoman = ((10.0*mass) + (6.25*height)-(5*age)-161);
	
	System.out.println("BMR for a man: " + bmrMan + " kcal/day");
	System.out.println("BMR for a woman: " + bmrWoman + " kcal/day");	
	}
}
