package com.day1.languagefundamentals._2reservedwords;

public class Q6BreakContinueDemo {

	public static void main(String[] args) {
		// -------------------
		// Example 1: break
		// -------------------
		System.out.println("Demonstrating break in a for loop:");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("Break at i = " + i);
				break; // exit the loop when i is 5
			}
			System.out.println(i);
		}

		// -------------------
		// Example 2: continue
		// -------------------
		System.out.println("\nDemonstrating continue in a for loop:");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // skip even numbers
			}
			System.out.println(i); // prints only odd numbers
		}
	}
}
