import java.util.Scanner;

public class BestStudent{
	public static void main(String[] args) {
	int students;
	String name = null, highName=null;
	double highScore=0,score=0;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of students:");
	students = input.nextInt();
	
	for (int i=1; i<=students; i++){
		System.out.println("Student "+i+" of "+students);
		System.out.print("Enter student's name:");
		name=input.next();
		System.out.print("Enter student's score:");
		score = input.nextDouble();
			if (score>highScore){
			highScore = score;
			highName = name;
			}		
	}
	System.out.printf("The highest score was %.2f", (highScore));
	System.out.print(" and " +highName+" got it");
	}
}