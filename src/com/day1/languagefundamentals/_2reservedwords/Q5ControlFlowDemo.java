package com.day1.languagefundamentals._2reservedwords;

public class Q5ControlFlowDemo {

	public static void main(String[] args) {
		// -------------------
		// Example 1: if statement
		// -------------------
		int age = 18;
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}

		// -------------------
		// Example 2: for loop
		// -------------------
		System.out.println("\nPrinting numbers from 1 to 5 using for loop:");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// -------------------
		// Example 3: while loop
		// -------------------
		System.out.println("\nPrinting numbers from 5 to 1 using while loop:");
		int j = 5;
		while (j >= 1) {
			System.out.println(j);
			j--; // decrement to avoid infinite loop
		}
	}
}
