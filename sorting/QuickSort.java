package sorting;

import java.util.Random;

public class QuickSort {
	
	public static void sort(int[] array) {
		int n = array.length;
		shuffle(array);
		sort(array, 0, n - 1);
	}
	
	private static void sort(int[] array, int lo, int hi) {
		if (hi <= lo) return;
		int j = partition(array, lo, hi);
		sort(array, lo, j - 1);
		sort(array, j + 1, hi);
	}
	
	private static int partition(int[] array, int lo, int hi) {
		int i = lo + 1;
		int j = hi;
		int pivot = array[lo];
		while (i <= j) {
			while (array[i] <= pivot) {
				i++;
				if (i > hi) break;
			}
			while (array[j] >= pivot) {
				j--;
				if (j == lo) break;
			}
			if (i >= j) break;
			swap(array, i, j);
		}
		swap(array, lo, j);
		return j;
	}
	
	private static void shuffle(int[] array) {
		Random random = new Random();
		for (int i = 1; i < array.length; i++) {
			int j = random.nextInt(i + 1); // [0, i]
			swap(array, i, j);
		}
	}
	
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
		int[] A = {15, 20, 11, 8, 1, 1, 1, 1, 3, 99, 12, 2, 8, 7, 3}; 
		sort(A);
		print(A);
	}
}