package Lab03;
//Ekta Rana
//SBU ID: 111030624
//CSE 114
//Lab #2 : ChangeMaker

import java.util.Scanner;

public class ValidSSN {
	public static void main(String[] args) {

		String ssn; 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a valid SSN: " );
		ssn = input.next();
		
		if ((ssn.substring(3,4).equals("-")) && (ssn.substring(6,7).equals("-"))){
			System.out.println(ssn + " is a valid Social Security Number." );
		}			
		input.close();
	}	
}