public class Test {
	public static void main(String[] args) {

		int[][] array = { { 4, 3, 1, 7 }, { 5, 2, 0, 1 }, { 3, 1, 1, 8 }, { 2, 6, 5, 9 } };
		swap(array);
		
	}

	public static int[][] swap(int[][] array) {
		int[][] newarray = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				newarray[3-j][3-i] = array[i][j];
			}
		}
		return newarray;
	}
}