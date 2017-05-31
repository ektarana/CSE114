//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #3 : Part 1: Time Flies When You’re Having Fun

import java.util.Scanner;

public class PalindromicDate {
	public static void main(String[] args) {
		String month, numberMonth=null, textYear, textDay, zero = "0"; 
		int day, year; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter month: ");
		month = input.next();
		System.out.print("Enter day: ");
		day = input.nextInt();
		System.out.print("Enter year: ");
		year = input.nextInt();
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

		//checks for valid date and year	
				if ((day<1) || (day>32) || (year<1)){
					System.out.print("Bad input.");
					System.exit(0);
				}	
		month = month.toUpperCase();
		
		textYear = Integer.toString(year);
		//if the length of year is less than 10, it adds a leading zero
				if (textYear.length()<2){
					textYear = zero.concat(textYear);
				}
		//this makes textYear only the last two items of year
		textYear = textYear.substring(textYear.length()-2, textYear.length());
		
		textDay = Integer.toString(day);
		//if the length of day is less than two, it adds a leading zero
				if (textDay.length()<2){
					textDay = zero.concat(textDay);
				}
		
		if (month.equals("JANUARY")){
			numberMonth = "01";
		}else if ((month.equals("FEBRUARY"))&&(day<30)){
			if ((day==29)&&(isLeapYear)){
				numberMonth = "02";
			}
			else if ((day<29)&&(isLeapYear)){
				numberMonth = "02";
			}
			else if ((day==29)&&!(isLeapYear)){
				System.out.print("Bad input.");
				System.exit(0);
			}
			else{
				numberMonth = "02";
			}	
		}else if (month.equals("MARCH")){
			numberMonth="03";
		}else if ((month.equals("APRIL"))&&(day<31)){
			numberMonth="04";
		}else if (month.equals("MAY")){
			numberMonth="05";
		}else if ((month.equals("JUNE"))&&(day<31)){
			numberMonth="06";
		}else if (month.equals("JULY")){
			numberMonth="07";
		}else if (month.equals("AUGUST")){
			numberMonth="08";
		}else if ((month.equals("SEPTEMBER"))&&(day<31)){
			numberMonth="09";
		}else if (month.equals("OCTOBER")){
			numberMonth="10";
		}else if ((month.equals("NOVEMBER"))&&(day<31)){
			numberMonth="11";
		}else if (month.equals("DECEMBER")){
			numberMonth="12";
		}else{
			System.out.print("Bad input.");
			System.exit(0);
		}

		System.out.println("Reformatted date: " + numberMonth + "/" + textDay + "/" + textYear);

		String fullDate = numberMonth + textDay + textYear;
		
		//palindrome check
		if (fullDate.substring(0,1).equals(fullDate.substring(5))){
			if (fullDate.substring(1,2).equals(fullDate.substring(4,5))){
				if (fullDate.substring(2,3).equals(fullDate.substring(3,4))){
					System.out.print("Palindrome? yes");
				}
				else{System.out.print("Palindrome? no");}
			}
			else{System.out.print("Palindrome? no");}
		}
		else {System.out.print("Palindrome? no");}	
	}
}