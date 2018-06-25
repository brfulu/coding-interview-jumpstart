package binarySearch;

public class NumberOfOccurrences {

	public static int firstOccurrence(int[] array, int target) {
		int lo = 0;
		int hi = array.length - 1;
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (target > array[mid]) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		if (array[lo] == target) {
			return lo;
		} else {
			return -1;
		}
	}
	
	public static int lastOccurrence(int[] array, int target) {
		int lo = 0;
		int hi = array.length - 1;
		while (lo < hi) {
			int mid = (lo + hi + 1) / 2;
			if (target < array[mid]) {
				hi = mid - 1;
			} else {
				lo = mid;
			}
		}
		if (array[lo] == target) {
			return lo;
		} else {
			return -1;
		}
	}
	
	public static int numberOfOccurrences(int[] array, int target) { // O(logn)
		int first = firstOccurrence(array, target); // O(logn)
		int last = lastOccurrence(array, target);   // O(logn)
		if (first == -1) {
			return 0;
		} else {
			return last - first + 1; // [lo, hi] => hi - lo + 1
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 3, 3, 4, 4, 6, 6, 6, 6, 7, 7, 7, 8, 8, 11, 15, 22};
		int count = numberOfOccurrences(array, 4);
		System.out.println(count);
	}
	
	// linear solution O(n)
	
}
