package sorting;

public class CountingSort {

	public static void sort(int[] array) { // O(n + k) = O(n)
		int n = array.length;
		int max = 0;
		for (int i = 0; i < n; i++) { // O(n)
			max = Math.max(max, array[i]);
		}
		countingSort(array, max);
	}
	
	private static void countingSort(int[] array, int k) {
		int n = array.length;
		int[] output = new int[n];
		int[] count = new int[k + 1];
		
		for (int i = 0; i < array.length; i++) { // O(n)
			count[array[i]]++;
		}
		
		// count[x] = # of occurrences of number x
		
		for (int i = 1; i <= k; i++) { // O(k)
			count[i] += count[i-1];
		}
		
		// count[x] = # of elements in original array which are smaller than or equal to x
		
		for (int i = 0; i < array.length; i++) { // O(n)
			int index = count[array[i]] - 1;
			output[index] = array[i];
			count[array[i]]--;
		}
		
		// output[] = sorted input array
		
		for (int i = 0; i < array.length; i++) { // O(n)
			array[i] = output[i];
		}
		
		// array[] = sorted array
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
		int[] A = {8, 4, 13, 19, 11, 2, 6, 3, 9, 11, 1, 2};
		sort(A);
		print(A);
	}
}