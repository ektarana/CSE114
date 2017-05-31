//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #4 : Part 3: Run-length Encoding

import java.util.Scanner;

public class RunLengthEncoding {
	public static void main(String[] args) {
		String text, flag, output = ""; 
		Scanner input = new Scanner(System.in);
	
	//ask for the string 
		System.out.print("Enter input string: ");
		text = input.next();
	//check for lowercase letters
		if (text.contains("a")||text.contains("b")||text.contains("c")||text.contains("d")||text.contains("e")||text.contains("f")||text.contains("g")||text.contains("h")||text.contains("i")||text.contains("j")||text.contains("k")||text.contains("l")||text.contains("m")||text.contains("n")||text.contains("o")||text.contains("p")||text.contains("q")||text.contains("r")||text.contains("s")||text.contains("t")||text.contains("u")||text.contains("v")||text.contains("w")||text.contains("x")||text.contains("y")||text.contains("z")){
			System.out.print("Bad input.");
			System.exit(0);
		}
	//ask for flag	
		System.out.print("Enter flag character: ");
		flag = input.next();
	//check for valid flag		
		if (!(flag.equals("#") || flag.equals("$") || flag.equals("&") || flag.equals("*"))){
			System.out.print("Bad input.");
			System.exit(0);
		}
		for (int i = 0; i < text.length() - 1; i++){
			int runlength = 1;
			while (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1)){
				runlength++;
				i++;
			}
			if (runlength <= 3){
				for (int n = 0; n < runlength; n++){
					output += text.charAt(i);
				}
			}
			else {
				output += (flag + text.charAt(i) + runlength);}
		}		
		System.out.println("Encoded: " + output);	
	}
}