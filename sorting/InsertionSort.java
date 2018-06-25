package sorting;

public class InsertionSort {

	public static void sort(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
				swap(array, j, j - 1);
			}
		}
	}
	

	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	private static void print(int[] A) {
		System.out.print("[");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
			if (i < A.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] A = { 8, 4, 2, 6, 3, 9, 11, 1, 2 };
		sort(A);
		print(A);
	}
}