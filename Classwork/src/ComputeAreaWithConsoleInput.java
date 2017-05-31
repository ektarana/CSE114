import java.util.Scanner;
//sept 7, 2016 
public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		double radius;
		double area;
		// Prompt the user to enter a radius
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = input.nextDouble(); 
		
		area = 3.14159 * radius * radius;
		System.out.print("The area of a circle with radius " + radius + " is " + area);
}
}