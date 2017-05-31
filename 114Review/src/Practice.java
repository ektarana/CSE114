
public class Practice {
	public static void main (String[] args){
	//System.out.println(encrypt("cdefghzab")); 
	reverse("the quick fox");
	}
		
	public static String encrypt(String str){
		if(str.length()==0)
			return str;  
		if(str.charAt(0)== 'y'){
			return "a" + encrypt(str.substring(1, str.length()));
		}
		else if(str.charAt(0)== 'z'){
			return "b" + encrypt(str.substring(1, str.length()));
		}
		return (char)(str.charAt(0)+2) + encrypt(str.substring(1, str.length()));
	}

	public static void reverse (String whatever){
		if(whatever.length()==0)
			return; 
		System.out.print(whatever.charAt(whatever.length()-1));
		reverse(whatever.substring(0, whatever.length()-1));
	}
}
