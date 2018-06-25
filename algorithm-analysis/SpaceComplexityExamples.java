package algorithm_analysis;

public class SpaceComplexityExamples {
	
	// Space: O(1)
	public static int example1(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	// Space: O(n)
	public static int[] example2(int[] array) {
		int n = array.length;
		int[] result = new int[2 * n];
		for (int i = 0; i < n; i++) {
			result[i] = array[i];
			result[n + i] = array[i];
		}
		return result;
	}
	
	// Space: O(n * m)
	public static int example3(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum += matrix[i][j];
			}
		}
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = matrix[i][0];
		}
		return sum;
	}
}
