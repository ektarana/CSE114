//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #4 : Part 1: Prime Factorization

import java.util.Scanner;
public class PrimeFactorization {
	public static void main(String[] args) {
		int number = 0, product;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integers: ");
		number = input.nextInt();
		product = number;

		if (number < 1){
			System.out.print("Bad input."); 
			System.exit(0);
		}
		else if (number>0) {
			while (number>0){
				number = input.nextInt();
				if (number>0){
				product = number * product; 
				}
			}
		}
		System.out.println("Product: " + product);
		System.out.print("Prime factorization: ");
	
	//exponentVal is to increase the value of the exponent as i increases
		int exponentVal = 0;
		
		for (int i = 2; i<=product; i++){
			exponentVal = 0;
			while(product%i == 0){
				product = product/i;
				exponentVal ++;
			}
			if (exponentVal>0){
			System.out.print(i + "^" + exponentVal + " ");
			}
		}
	}	
} 