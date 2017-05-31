//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #7: III: Java Source Code Reformatter
import java.io.*;
import java.util.Scanner;

public class ReformatCode {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Invalid argument.");
			System.exit(1);
		}
		File filename = new File(args[0]); // the args you pass to the command line						
		File filename2 = new File(args[1]);

		if (!filename.exists()) {
			System.out.println(filename + " does not exist.");
			System.exit(2);
		}
		StringBuilder buff = new StringBuilder();
		try {
			Scanner fileLines = new Scanner(filename);
			while (fileLines.hasNext()) {
				String s = fileLines.nextLine();
				if (s.contains("{"))
					buff.append(" {");// adds to previous line
				else
					buff.append("\n" + s); // else appends a new line and
											// contents of the line itself

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			PrintWriter output = new PrintWriter(filename2); // creates new
																// file, Test2
			output.write(buff.toString());
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(buff);
	}

}