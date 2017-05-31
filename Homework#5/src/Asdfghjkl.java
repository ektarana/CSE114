import java.util.Arrays;
public class Asdfghjkl {
	public static void main(String[] args){
		System.out.println("Part 5:");
		int[][] nums2D = new int[][]{ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };
		rotateRight(nums2D, 2);
		System.out.println(Arrays.toString(nums2D));

//		nums2D = new int[][]{ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };
//		rotateRight(nums2D, 7);
//		
//		nums2D = new int[][]{ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };
//		rotateRight(nums2D, -1);
	}
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
	}	}