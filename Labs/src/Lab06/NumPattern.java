package Lab06;

public class NumPattern {
	public static void main (String[] args){
		printTriangle(5);
	}
	
	public static void printTriangle(int n){ 
		for (int row=1; row<=n; row++){
			for(int col=row; col>0; col--){
				System.out.print(col+" ");
				}
			System.out.println();
		}	
	}
}
