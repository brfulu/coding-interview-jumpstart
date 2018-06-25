package sorting;

public class SelectionSort {
	
	public static void sort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			swap(array, i, min);
		}
	}
	
	// n + (n - 1) + (n - 2) + ... + 1 = n*(n + 1)/2
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private static void print(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int[] A = {85, 4, 22, 16, 33, 9, 11, 1, 19, 8, 6, 7};
		sort(A);
		print(A);
	}
	
}
