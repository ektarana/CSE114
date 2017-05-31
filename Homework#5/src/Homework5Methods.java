import java.util.Arrays;

//Ekta Rana
//SBU ID: 111030624
//CSE 114
//HW #5 : Methods for parts 1-5

public class Homework5Methods {
	// part 1
	public static String eliminateDuplicates(String str) {
		StringBuilder strCopy = new StringBuilder("");
		for (int i=0; i<str.length();i++){
			boolean dup = false;
			for (int j=0; j<strCopy.length();j++){
				if (str.charAt(i)==strCopy.charAt(j)){
					dup=true; 
				}
			}
			if (dup==false)
				strCopy.append(str.charAt(i));
		}
		return strCopy.toString();
	}

	// part 2
	public static String getDigits(String phoneNumber) {
		StringBuilder phoneNumberDigits = new StringBuilder("");
		//this loop appends only letters and digits to the new string, phoneNumberDigits
		for (int i = 0; i<phoneNumber.length(); i++){
			if(Character.isLetterOrDigit(phoneNumber.charAt(i))){
				phoneNumberDigits.append(phoneNumber.charAt(i));
				}
		}
		//this loop checks ascii values and replaces letters with numbers 
		for (int i = 0; i<phoneNumberDigits.length(); i++){
			if((int)phoneNumberDigits.charAt(i)==48){
				phoneNumberDigits.replace(i, i+1, "0");	
			}else if((int)phoneNumberDigits.charAt(i)==49){
				phoneNumberDigits.replace(i, i+1, "1");	
			}else if((int)phoneNumberDigits.charAt(i)==65 || (int)phoneNumberDigits.charAt(i)==66 || (int)phoneNumberDigits.charAt(i)==67 || (int)phoneNumberDigits.charAt(i)==97 || (int)phoneNumberDigits.charAt(i)==98 || (int)phoneNumberDigits.charAt(i)==99 || (int)phoneNumberDigits.charAt(i)==50){
				phoneNumberDigits.replace(i, i+1, "2");				
			}else if((int)phoneNumberDigits.charAt(i)==68 || (int)phoneNumberDigits.charAt(i)==69 || (int)phoneNumberDigits.charAt(i)==70 || (int)phoneNumberDigits.charAt(i)==100 || (int)phoneNumberDigits.charAt(i)==101 || (int)phoneNumberDigits.charAt(i)==102 || (int)phoneNumberDigits.charAt(i)==51){
				phoneNumberDigits.replace(i, i+1, "3");	
			}else if((int)phoneNumberDigits.charAt(i)==71 || (int)phoneNumberDigits.charAt(i)==72 || (int)phoneNumberDigits.charAt(i)==73 || (int)phoneNumberDigits.charAt(i)==103 || (int)phoneNumberDigits.charAt(i)==104 || (int)phoneNumberDigits.charAt(i)==105 || (int)phoneNumberDigits.charAt(i)==52){
				phoneNumberDigits.replace(i, i+1, "4");
			}else if((int)phoneNumberDigits.charAt(i)==74 || (int)phoneNumberDigits.charAt(i)==75 || (int)phoneNumberDigits.charAt(i)==76 || (int)phoneNumberDigits.charAt(i)==106 || (int)phoneNumberDigits.charAt(i)==107 || (int)phoneNumberDigits.charAt(i)==108 ||(int)phoneNumberDigits.charAt(i)==53){
				phoneNumberDigits.replace(i, i+1, "5");
			}else if((int)phoneNumberDigits.charAt(i)==77 || (int)phoneNumberDigits.charAt(i)==78 || (int)phoneNumberDigits.charAt(i)==79 || (int)phoneNumberDigits.charAt(i)==109 || (int)phoneNumberDigits.charAt(i)==110 || (int)phoneNumberDigits.charAt(i)==111 || (int)phoneNumberDigits.charAt(i)==54){
				phoneNumberDigits.replace(i, i+1, "6");
			}else if((int)phoneNumberDigits.charAt(i)==80 || (int)phoneNumberDigits.charAt(i)==81 || (int)phoneNumberDigits.charAt(i)==82 || (int)phoneNumberDigits.charAt(i)==83 || (int)phoneNumberDigits.charAt(i)==112 || (int)phoneNumberDigits.charAt(i)==113 || (int)phoneNumberDigits.charAt(i)==114 || (int)phoneNumberDigits.charAt(i)==115 || (int)phoneNumberDigits.charAt(i)==55){
				phoneNumberDigits.replace(i, i+1, "7");
			}else if((int)phoneNumberDigits.charAt(i)==84 || (int)phoneNumberDigits.charAt(i)==85 || (int)phoneNumberDigits.charAt(i)==86 || (int)phoneNumberDigits.charAt(i)==116 || (int)phoneNumberDigits.charAt(i)==117 || (int)phoneNumberDigits.charAt(i)==118 || (int)phoneNumberDigits.charAt(i)==56){
				phoneNumberDigits.replace(i, i+1, "8");
			}else if((int)phoneNumberDigits.charAt(i)==87|| (int)phoneNumberDigits.charAt(i)==88 || (int)phoneNumberDigits.charAt(i)==89 || (int)phoneNumberDigits.charAt(i)==90 || (int)phoneNumberDigits.charAt(i)==116 || (int)phoneNumberDigits.charAt(i)==119 || (int)phoneNumberDigits.charAt(i)==121 || (int)phoneNumberDigits.charAt(i)==122 || (int)phoneNumberDigits.charAt(i)==57){
				phoneNumberDigits.replace(i, i+1, "9");
			}		
		}//close the replacing for loop
		return phoneNumberDigits.toString();
	}

	// part 3
	public static int lowestBasePalindrome(int num) {
		boolean palindromeFound = false; 	
		int base = 2;
		int rem, quo=num;
		while (palindromeFound==false){
			int length = (int)((Math.log(num)/Math.log(base))+1);
			int[] convertedArray = new int[length];
		//convert it from dec to base two
			 //what you want to save is the rem, put in array
			while (quo !=0){
				for (int i=0; i<convertedArray.length; i++){
			    	rem = quo%base;
					quo = quo/base;
			    	convertedArray[i] = rem;
				}
			}
		//check if palindrome
			int[] convertedArrayCopy = new int[convertedArray.length];
			for (int i=0; i<length; i++){
				convertedArrayCopy[i]=convertedArray[convertedArray.length-i-1];
			}
			if(Arrays.equals(convertedArrayCopy, convertedArray)){
		    		palindromeFound = true; 
		    }
		    else{
		    	base++;
		    	quo=num;
		    	rem=0;
		    }
		}
		return base;
	}
	
	// part 4
	public static int[] interleaveArrays(int[] array1, int[] array2, int stride, int maxElements) {
		int leafLength = array1.length+array2.length;
		int[] leaf = new int[leafLength];
		int leafIndex=0, c1=0, c2=0; 
		if (stride <= 0 || maxElements <= 0){
			return null;
			}
		while(leafIndex < maxElements || leafIndex<leaf.length){ 
			//you need a1/a2 to make sure you don't go past the stride
			//c1 and c2 save the index you at in each array
			//leafIndex remembers wya in the leaf
			for (int a1 = 0; a1<stride && c1<array1.length; a1++){
				leaf[leafIndex] = array1[c1];
				c1++;
				leafIndex++;
			}
			for (int a2 = 0; a2<stride && c2<array2.length; a2++){
				leaf[leafIndex] = array2[c2];
				c2++;
				leafIndex++;
			}
		}
		return leaf;
	}
	
	// part 5
	public static void rotateRight(int[][] matrix, int numCols) {		
		for (int i = 0; i< matrix.length; i++){
			int[] rowCopy = new int[matrix[i].length];
			//this takes the row of matrix[i] and makes a copy of just that row
			for (int omg=0; omg<matrix[i].length; omg++){
				rowCopy[omg] = matrix[i][omg];
			}
			//this should take the element at matrix[i][j] and shift it by
			for (int j = 0; j<matrix[i].length; j++){
				matrix[i][(j+numCols)%matrix[i].length] = rowCopy[j];
			}
		} 	
	}	
}	