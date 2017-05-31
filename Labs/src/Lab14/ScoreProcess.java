package Lab14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScoreProcess {
	public static void main(String[] args) {
		int total = 0, count =0;
		Scanner input = null; 
		
		try{
			input = new Scanner (new File ("C:/Users/erana/Desktop/process.txt"));
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		
		while (input.hasNextInt()){
			total+= input.nextInt();
			count++;
		}
		System.out.println("Total: "+ total);
		System.out.println("Count: " + count);
	
		input.close();
	}
}