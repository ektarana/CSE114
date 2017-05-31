//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #2 : Part 2 : Feeding the Animals

import java.util.Scanner;

public class PetShelter {
	public static void main(String[] args) {
		
		int cats, dogs, budget, amountPerDog;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of cats: ");
		cats = input.nextInt();
		System.out.print("Enter number of dogs: ");
		dogs = input.nextInt();
		System.out.print("Enter weekly budget: ");
		budget = input.nextInt(); 
		
	//calculate amt per dog
		amountPerDog = 2*(budget/(cats + 2*dogs));
		
		System.out.println("Amount to spend per dog: $" + amountPerDog);
	}
}
