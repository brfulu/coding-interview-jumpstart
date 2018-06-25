package algorithm_analysis;

import java.util.Scanner;

// For a given integer n, determine whether the number is prime or not.

public class PrimeNumber {

	// Time: O(sqrt(n))
	public static boolean isPrime(long n) {
		if (n < 2) {
			return false;
		}
		int limit = (int)Math.sqrt(n);
		for (long i = 2; i <= limit; i++) { // It's enough to check until sqrt(n)
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long startTime = System.nanoTime();
		
		System.out.println(isPrime(n));
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.printf("Time: %.4fs", (totalTime / 1000000000.0)); // print execution time
		sc.close();
	}

}

// For each number, we can divide its divisors into two groups
// 1) integers smaller than the square root
// 2) integers greater than the square root

// 1 2 3 4 6 | 9 12 18 36
// 1 * 36 = 36
// 2 * 18 = 36
// 3 * 12 = 36
// 4 * 9
// 6 * 6 = 36


// For testing purpose:
// Prime numbers: 7, 101, 103703 1000000007 32416190039