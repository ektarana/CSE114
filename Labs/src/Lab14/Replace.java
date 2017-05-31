package Lab14;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Replace {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PrintWriter pw = null;
		try{
			input = new Scanner (new File ("C:/Users/erana/Desktop/sample.txt"));
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		try{
			pw = new PrintWriter(new File ("C:/Users/erana/Desktop/test.txt"));
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}
	String s;
	while (input.hasNextLine()){
		s = input.nextLine();
		System.out.println(s);
		s = s.replaceAll("Java", "HTML");
		System.out.println(s);
		pw.println(s);
	}
	input.close();
	pw.close();
	}	
}
