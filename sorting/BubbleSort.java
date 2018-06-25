package sorting;

public class BubbleSort {
	
	public static void sort(int[] array) {
		int n = array.length;
		while (true) {
			boolean swapped = false;
			for (int i = 0; i < n - 1; i++) {
				if (array[i + 1] < array[i]) {
					swap(array, i, i + 1);
					swapped = true;
				}
			}
			if (!swapped) break;
		}
	}
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
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
		int[] A = {105, 8, 4, 22, 16, 3, 9, 11, 1, 19, 8, 6, 7};
		sort(A);
		print(A);
	}

}



