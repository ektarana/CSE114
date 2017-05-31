//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #3 : Part 4: What Day is It?

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		int year, month, dayOfMonth, century, twoDigitYear, dayOfWeek;
		String textYear; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (e.g., 1918): ");
		year = input.nextInt();
		System.out.print("Enter month (1-12): ");
		month = input.nextInt();
		System.out.print("Enter the day of the month (1-31): ");
		dayOfMonth = input.nextInt();
		
		if (month==1){
			month = 13;
			year--;
		}else if (month==2){
			month = 14;
			year--;
		}
		
		twoDigitYear = year%100;
		textYear = Integer.toString(year);
		textYear= textYear.substring(0,2);
		century = Integer.parseInt(textYear);

		dayOfWeek = (dayOfMonth + ((13*(month+1))/5) + twoDigitYear + (twoDigitYear/4) + (century/4) + (5*century))%7;
		
		if (dayOfWeek==0){
			System.out.print("The day of the week is Saturday");
		}
		else if (dayOfWeek==1){
			System.out.print("The day of the week is Sunday");
		}else if (dayOfWeek==2){
			System.out.print("The day of the week is Monday");
		}else if (dayOfWeek==3){
			System.out.print("The day of the week is Tuesday");
		}else if (dayOfWeek==4){
			System.out.print("The day of the week is Wednesday");
		}else if (dayOfWeek==5){
			System.out.print("The day of the week is Thursday");
		}else {
			System.out.print("The day of the week is Friday");
		}
	}
}
