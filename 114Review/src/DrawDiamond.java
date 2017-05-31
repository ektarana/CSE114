public class DrawDiamond {
	public static void main(String[] args) {
		diamond(10);
	}

	public static void diamond(int n) {
		diamondUp(1,n);
		diamondDown(n-1,n);
	}
	public static void diamondUp(int i, int n){
		if(i<=n){
			printMessage(n-i, " ");
			printMessage(2*i-1, "*");
			System.out.println();
			diamondUp(i+1,n);
		}
	}
	public static void printMessage(int n, String s){
		if(n>0){
			System.out.println(s);
			printMessage(n-1,s);
		}
	}
	public static void diamondDown(int i, int n){
		if (i>0){
			printMessage(n-i, " ");
			printMessage(2*i-1, "*");
			System.out.println();
			diamondDown(i-1,n);
		}
	}
}