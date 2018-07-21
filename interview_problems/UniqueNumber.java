package interview_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UniqueNumber {
	
	// Solution 1: Brute Force
	// Try for each number, check how many times does the current number appear.
	// If the current counter is equal to 1, we have found the solution
	// Time: O(n^2)
	// Extra Space: O(1)
	public static int bruteForce(int n, int[] array) {
		// Traverse the whole array and fix the current number
		for (int i = 0; i < n; i++) {
			int currentNumber = array[i];
			int counter = 0;
			
			// Again traverse the array, and count how many times currentNumber appears
			for (int j = 0; j < n; j++) {
				if (array[j] == currentNumber) {
					counter++;
					if (counter > 1) {
						break;
					}
				}
			}
			
			// check whether this is a solution
			if (counter == 1) {
				return currentNumber;
			}
		}
		
		return -1; // Array is not valid
	}
	
	// Solution 2: Counting array
	// We will create a helper counting array, which will tell us for each number, how many times does it appear.
	// count[i] = the number of occurrences of the number i in the input array so far
	// Time: O(n)
	// Extra Space: O(maxNumber)
	public static int countingArray(int n, int[] array) {
		int maxNumber = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] > maxNumber) {
				maxNumber = array[i];
			}
			if (array[i] < 0) {
				return -1;
			}
		}
		
		int[] count = new int[maxNumber + 1];
		// Iterate throught the array, and fill the count array
		for (int i = 0; i < n; i++) {
			int currentNumber = array[i];
			count[currentNumber]++;
		}
		
		// Loop again through the array, and find element x, such that count[x] = 1
		for (int i = 0; i < n; i++) {
			int currentNumber = array[i];
			if (count[currentNumber] == 1) {
				return currentNumber;
			}
		}
		
		return -1; // Invalid array
	}
	
	// Solution 3: Map implemented with BST/Hashing
	// We will create a helper counting map, which will tell us for each
	// number, how many times does it appear.
	// count[i] = the number of occurrences of the number i in the input array
	// so far
	// Time: O(n)
	// Extra Space: O(n)
	public static int countingMap(int n, int[] array) {
		Map<Integer, Integer> count = new HashMap<>(); // new TreeMap<>();
		
		// Iterate through the array, and fill the count array
		for (int i = 0; i < n; i++) {
			int currentNumber = array[i];
			int prevCounter = 0;
			if (count.keySet().contains(currentNumber)) {
				prevCounter = count.get(currentNumber);
			}
			count.put(currentNumber, prevCounter + 1);
		}

		// Loop again through the array, and find element x, such that count[x]
		// = 1
		for (int i = 0; i < n; i++) {
			int currentNumber = array[i];
			if (count.get(currentNumber) == 1) {
				return currentNumber;
			}
		}

		return -1; // Invalid array
	}
	
	
	// Solution 4: Sorting
	// 1, 1, 2, 2, 3, 5, 5
	// For each element at index i, check array[i-1] and array[i+1], if none of is equal to array[i]
	// This is the solution
	// Time: O(nlogn)
	// Extra Space: O(1)
	public static int sorting(int n, int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < n; i++) {
			int currentNumber = array[i];
			int matches = 0;
			if (i > 0 && array[i-1] == currentNumber) {
				matches++;
			}
			if (i < n - 1 && array[i+1] == currentNumber) {
				matches++;
			}
			if (matches == 0) {
				return currentNumber;
			}
		}
		return -1; // Invalid array
	}
	
	// Solution 5: XOR
	// Calculate the XOR of all elements in the array, and this will be the result
	// Time: O(n)
	// Extra Space: O(1)
	public static int xor(int n, int[] array) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result ^= array[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = {2, 1, 1, 3, 3, 5, 5, 2, 9, 8, 8};
		int solution = xor(11, array);
		System.out.println(solution);
	}

}



