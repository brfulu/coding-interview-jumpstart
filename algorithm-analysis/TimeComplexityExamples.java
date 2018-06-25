package algorithm_analysis;

public class TimeComplexityExamples {
	
	// Time: O(n^2)
	public static boolean hasDuplicates(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && array[i] == array[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	// Time: O(n^2)
	public static int f(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				sum += i * j;
			}
		}
		for (int i = 0; i < n; i++) {
			sum = sum - i;
		}
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	// Time: O(n + m)
	public static int[] union(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		int[] C = new int[n + m];
		int index = 0;
		for (int i = 0; i < n; i++) {
			C[index] = A[i];
			index++;
		}
		for (int i = 0; i < m; i++) {
			C[index] = B[i];
			index++;
		}
		return C;
	}

	// Time: O(n * m)
	public static int matrixSum(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}
	
	// Time: O(logn)
	public static int g(int n) {
		int result = 0;
		int i = n;
		while (i > 1) {
			result += i;
			i /= 2;
		}
		return result;
	}
	
}
