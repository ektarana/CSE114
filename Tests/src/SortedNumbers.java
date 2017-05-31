import java.util.Scanner;
public class SortedNumbers{
	public static void main (String[] args){
		double numA, numB, numC; 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three numbers: ");
		numA = input.nextDouble();
		numB = input.nextDouble();
		numC = input.nextDouble();
		displaySortedNumbers(numA, numB, numC);
	}	
		public static void displaySortedNumbers(double  num1, double  num2, double  num3){
			if ((num1<num2)&&(num1<num3)){
				System.out.print(num1+" ");
				if (num2<num3){
					System.out.print(num2+ " "+num3);
				}
				else{
				System.out.print(num3+ " "+num2);
				}
			}else if ((num2<num1)&&(num2<num3)){
				System.out.print(num2+" ");
				if (num1<num3){
					System.out.print(num1+ " "+num3);
				}
				else{
				System.out.print(num3+ " "+num1);
				}
			}else {
				System.out.print(num3+ " ");
				if (num2<num1){
					System.out.print(num2+ " "+num1);
				}else{
					System.out.print(num1+" "+num2);
				}	
			}
		}
}