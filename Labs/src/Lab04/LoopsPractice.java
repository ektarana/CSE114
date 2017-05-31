package Lab04;

/*Write a program that sorts three integers. 
The integers are entered from the input dialogs 
and stored in variables num1, num2, and num3, respectively. 
The program prints the sorted numbers. */

import java.util.Scanner;

public class LoopsPractice {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int num1 = input.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = input.nextInt();
		System.out.print("Enter number 3: ");
		int num3 = input.nextInt();
		
		System.out.print("From highest to lowest: ");
		
		if (num1 > num2 && num1 > num3){
			System.out.print(num1 + " ");
			if(num2>num3){
				System.out.print(num2 + " " + num3);
			}else{
				System.out.print(num3 + " " + num2);
			}
		}else if (num2 > num1 && num2 > num3){
			System.out.print(num2 + " ");
			if(num1>num3){
				System.out.print(num1 + " "+  num3);
			}else{
				System.out.print(num3 + " "+ num1);
			}
		}else if (num3 > num1 && num3 > num1){
			System.out.print(num3 + " ");
			if(num1>num2){
				System.out.print(num1 + " "+  num2);
			}else{
				System.out.print(num2 + " "+ num1);
			}
		}
		input.close();
	}
}
