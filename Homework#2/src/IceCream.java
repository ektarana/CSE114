//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #2 : Part 1 : Brain Freeze

import java.util.Scanner;

public class IceCream {
	public static void main(String[] args) {
		
		int height, radius;
		double volume;
		Scanner input = new Scanner(System.in);
	//ask for radius
		System.out.print("Enter the radius of the hemispere (inches): ");
		radius = input.nextInt();
	//ask for height
		System.out.print("Enter the height of the cone (inches): ");
		height = input.nextInt();
		
	//calculate the volumes 
		volume = ((4*3.14*radius*radius*radius)/6) + ((3.14*(radius*radius*height))/3);
		
		System.out.println("Volume of ice cream (in cubic inches): " + volume); 

		
		
		
		
	}

}
