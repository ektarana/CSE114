import java.util.ArrayList;

public class Homework8Methods {
	// part 1
	public static int findTimes10(int[] nums) {
		return find10Helper(nums, 0);
	}
//helper method for part 1	
	public static int find10Helper(int[] nums, int i){
		if ((i+1) == nums.length){
			return -1;
		}
		else if(nums[i]*10 == nums[i+1])
			return i;
		else{
			return find10Helper(nums, i+1);
		}
	}	
	// part 2
	public static void replaceMult5(int[] nums, int newVal) {
		rep5Helper(nums, newVal, 0);
	}
	//helper method for part 2	
		public static void rep5Helper(int[] nums, int newVal, int i){
			if (i==nums.length){
				return; 
			}
			else if(nums[i]%5 == 0)
				nums[i] = newVal;
				rep5Helper(nums, newVal, i+1);
		}

	// part 3
	public static ArrayList<int[]> permuteArray(int[] array) {
		if(array.length==0){
			ArrayList<int[]> result = new ArrayList<int[]>(); 
			result.add(new int[(array.length)]);
			return result;
		}
		ArrayList<int[]> result = new ArrayList<int[]>();
		
		int firstEl = array[0]; 
		int[] everythingbutthefirst = new int[array.length-1];
		System.arraycopy(array, 1, everythingbutthefirst, 0, array[array.length]);
		
		ArrayList<int[]> otherPerms = permuteArray(array);
		
		for(int[] permutation: otherPerms){
			for (int i=0; i <= permutation.length; i++){
				int temp[]= null;
				temp[i] = firstEl; 
				//convert temp to array first,before adding
				result.add(temp); 
			}
		}return result; 
	}
	
		// part 4
	static int c = 1;
	static String combo = "";
	static String[] array;
	public static String[] mobius(String s1, String s2) {
	    combo = s1 + s2;
	    if (c == 1) {
	        array = new String[combo.length()];
	        array[0] = s1 + s2;
	    }
	    if (c < combo.length()) {
	        array[c] = mobiusHelper(s1 + s2, c++);
	        mobius(s1, s2);
	    }
	    return array;
	}
//part 4 helper
	public static String mobiusHelper(String s, int k) {
	    k = k % s.length();
	    return s.substring(k) + s.substring(0, k);
	}

static int counter = 0; //global var for part 5
	// part 5
	public static int teddy(int initial, int goal, int increment) {
		if(counter>10){
			counter=0; 
			return -1; 
		}
		else if(!(bears(initial, goal, increment, counter))){
			counter++; 
			return teddy(initial, goal, increment);
		}
		else{
			return counter;
		}
	}	
//part 5 helper
	public static boolean bears(int initial, int goal, int increment, int n){
		if (initial == goal)
			return true;
		else if (n==0)
			return false; 
		else if ((initial % 2 == 0) && bears((initial+initial)/2, goal, increment, n-1))
			return true;
		else if ((initial % 2 == 0) && bears(initial/2, goal, increment, n-1))
			return true;
		else if (bears(initial+increment, goal, increment, n-1))
			return true;
		else if (bears(initial-increment, goal, increment, n-1))
			return true;
		else
			return false;
	 }	
}