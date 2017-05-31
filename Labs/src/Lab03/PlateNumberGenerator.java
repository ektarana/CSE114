package Lab03;

import java.lang.Math;  
//Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a program to generate a plate number. Not that you cannot simply use(int)(Math.random()*10000) for the four digits...you'll see why soon enough!

public class PlateNumberGenerator {

	public static void main(String[] args) {
		int num1, num2, num3, num4, x;
		char l1, l2, l3;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		x = ((int)Math.floor(Math.random()*26));
		l1 = alphabet.charAt(x);
		x = ((int)Math.floor(Math.random()*26));
		l2 = alphabet.charAt(x);
		x = ((int)Math.floor(Math.random()*26));
		l3 = alphabet.charAt(x);

		
		num1 = (int) Math.floor(Math.random()*10); 
		num2 = (int) Math.floor(Math.random()*10); 
		num3 = (int) Math.floor(Math.random()*10); 
		num4 = (int) Math.floor(Math.random()*10); 
		
		System.out.println("Your random plate number is " +l1+""+l2+""+l3+" "+num1+""+num2+""+num3+""+num4);

	
	
	
	
	}
}
