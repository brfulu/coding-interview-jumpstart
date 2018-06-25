package binarySearch;

public class LastOccurrence {

	public static int lastOccurrence(int[] array, int target) {
		int lo = 0;
		int hi = array.length - 1;
		while (lo < hi) {
			int mid = (lo + hi + 1) / 2; // [1, 2]
			if (target < array[mid]) {
				hi = mid - 1; // [lo, mid-1]
			} else {
				lo = mid; // [mid, hi]
			}
		}
		if (array[lo] == target) {
			return lo;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2};
		int index = lastOccurrence(array, 1);
		System.out.println(index);
	}
	
	// lo = 0, hi = 1, mid = 1
	// lo = 0, hi = 0
}
