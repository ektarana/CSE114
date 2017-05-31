//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #4 : Part 2: Base Conversion

import java.util.Scanner;

public class BaseToBase {
	public static void main(String[] args) {
		String number, result=null;
		int startingBase, endingBase,rem;
		int answer = 0, value = 0, currentPower = 1, dec = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		number = input.nextLine();
		System.out.print("Enter starting base: ");
		startingBase = input.nextInt();
		System.out.print("Enter ending base: ");
		endingBase = input.nextInt();
//iff the bases are equal	
		if (startingBase==(endingBase)){
			System.out.print("Result: " + number);}
//convert to decimal
		for (int i = number.length() - 1; i >= 0; i--){
			if (number.charAt(i) >= '0' && number.charAt(i) <= '9'){
				dec = (int) number.charAt(i) - '0';}
			else{
				dec = (int) number.charAt(i) - 'A' + 10;}
			value = value + (dec * currentPower);
			currentPower = currentPower * startingBase;
		}
	//changes to desired base
		while (value > 0){
			rem = value % endingBase;
			if (endingBase > 10){
				if (rem >= 10){
					result += Character.toUpperCase(Character.forDigit(rem, endingBase));}
				else{
					result += rem;}
			}
			else{
				result += rem;
			}
			value /= endingBase;
		}
		result = new StringBuffer(result).reverse().toString();
		System.out.println("Result: " + result);
	}
}