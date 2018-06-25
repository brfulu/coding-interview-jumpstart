package binarySearch;

public class FirstOccurrence {

	public static int firstOccurrence(int[] array, int target) {
		int lo = 0;
		int hi = array.length - 1;
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (target > array[mid]) {
				lo = mid + 1; // search the right half [mid + 1, hi]
			} else {
				hi = mid; // search left half + middle element [lo, mid]
			}
		}
		if (array[lo] == target) {
			return lo;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 3, 3, 4, 4, 6, 6, 6, 6, 7, 7, 7, 8, 8, 11, 15, 22};
		int index = firstOccurrence(array, 13);
		System.out.println(index);
	}
	
}
