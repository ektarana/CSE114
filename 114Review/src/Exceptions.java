import java.util.*;
import java.io.*;

public class Exceptions {
	Exception e = new Exception();
	
	public static void main(String[] args){
		File f = new File("input.txt");
		
		Scanner sc;
		
		try {
			sc = new Scanner(f);
			PrintWriter pw = new PrintWriter("output.txt");
			
			while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(line);
			pw.println(line + "abc");
			}
			pw.close();
		}
		catch (FileNotFoundException fe){
			System.out.print("file not found");
			fe.printStackTrace();
		}
		
		finally{
			System.out.print("finally");
		}
		

	}
}
