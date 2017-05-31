//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #7: Part II: Exception Handling
import java.lang.Exception;
public class HexBinDec {
	public static void main(String[] args) {
	//driver	
	//have only the try-catches in here
		
		//valid hex        
        try {
			String hex = "55b";
			int decimal = hex2Dec(hex);
			System.out.println("The decimal value for hex number "+ hex + " is " + decimal);

        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
        //invalid hex
        try {
			String hex = "2#4";
			int decimal = hex2Dec(hex);
			System.out.println("The decimal value for hex number "+ hex + " is " + decimal);

        } catch (HexFormatException e) {
            System.out.println(e.getMessage());
        }
        
        //valid binary
        try {
			String bin = "10101";
			int decimal = bin2Dec(bin);
			System.out.println("The decimal value for binary number "+ bin + " is " + decimal);

        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
        //invalid binary
        try {
			String bin = "123";
			int decimal = bin2Dec(bin);
			System.out.println("The decimal value for binary number "+ bin + " is " + decimal);

        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
	
		
} //close main

//method 1
//inside of these methods you throw exceptions 
	public static int hex2Dec(String hexString) throws HexFormatException{
		int decimal = 0;
		hexString=hexString.toUpperCase();

		if(!isValidHex(hexString))
			throw new HexFormatException(hexString + " is an invalid hex number"); 		
		
	    for (int i = 0; i < hexString.length(); i++) {
	      char hexChar = hexString.charAt(i);
	      decimal = decimal * 16 + hexCharToDecimal(hexChar);
	    }  
	    return decimal;	
	}
//helper method for the hex2dec conversion
	public static int hexCharToDecimal(char ch) {
	    if (ch >= 'A' && ch <= 'F')
	      return 10 + ch - 'A';
	    else
	      return ch - '0';
	  }
//this checks if the hex string is valid
	public static boolean isValidHex(String s) {
		for(int i = 0; i < s.length(); i++) {
			if (!((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'F')))
				return false;
			}
		return true;		
	}
	
//BINARY STUFF ----- method 2
	public static int bin2Dec(String binString) throws BinaryFormatException{
		int decimal = 0; 
		if(!isValidBin(binString))
			throw new BinaryFormatException(binString + " is an invalid binary number"); 		
	 
		int power = 0;
        for (int i = binString.length() - 1; i >= 0; i--) {

            if (binString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
	
// method helper for binary conversion
	public static boolean isValidBin(String binString) {
		for(int i = 0; i < binString.length(); i++) {
			if ((binString.charAt(i) != '0' && binString.charAt(i) != '1'))
				return false;
			}
		return true;		
	}	
//////////////the custom exception class for hex	
	static class HexFormatException extends Exception{
		public HexFormatException(String message) {
	        super(message);
	    }
		public String getMessage(){
			return super.getMessage();
		}
	}
//////////////the custom exception class for bin	
	static class BinaryFormatException extends Exception{
		public BinaryFormatException(String message) {
	        super(message);
	    }
		public String getMessage(){
			return super.getMessage();
		}
	}
}