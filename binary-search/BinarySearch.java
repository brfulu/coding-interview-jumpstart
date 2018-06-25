package binarySearch;

public class BinarySearch {
	
	public static int search(int[] array, int target) { // O(logn)
		int lo = 0;
		int hi = array.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (target > array[mid]) {
				lo = mid + 1;
			} else if (target < array[mid]) {
				hi = mid - 1;
			} else {
				return mid; // match
			}
		}
		return -1; // no match
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 3, 3, 4, 4, 6, 6, 6, 6, 7, 7, 7, 8, 8, 11, 15, 22};
		int index = search(array, 2);
		System.out.println(index);
	}
	
}
