package sorting;

public class MergeSort {
	
	public static void sort(int[] array) {
		int[] aux = new int[array.length];
		sort(array, aux, 0, array.length - 1);
	}
	
	private static void sort(int[] array, int[] aux, int lo, int hi) {
		if (hi <= lo) return;
		int mid = (lo + hi) / 2;
		sort(array, aux, lo, mid);
		sort(array, aux, mid + 1, hi);
		merge(array, aux, lo, mid, hi); // [lo, mid] [mid + 1, hi] => [lo, hi]
	}
	
	private static void merge(int[] array, int[] aux, int lo, int mid, int hi) {
		for (int i = lo; i <= hi; i++) {
			aux[i] = array[i];
		}
		
		int i = lo;
		int j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				array[k] = aux[j];
				j++;
			}
			else if (j > hi) {
				array[k] = aux[i];
				i++;
			}
			else if (aux[j] < aux[i]) {
				array[k] = aux[j];
				j++;
			}
			else {
				array[k] = aux[i];
				i++;
			}
		}
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
		int[] array = {105, 42, 22, 16, 36, 91, 11, 1, 19, 82, 6, 77};
		sort(array);
		print(array);
	}
}