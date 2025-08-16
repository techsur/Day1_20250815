package com.day1.languagefundamentals._4literals;

//15.	Program to count total literals in a given array of numbers and strings.
public class Q15LiteralCounter {

	public static void main(String[] args) {
		// Array containing numbers and strings
		Object[] arr = { 10, "Hello", 25.5, "Java", 42, "World" };

		int count = 0;

		// Loop through array and count elements
		for (Object element : arr) {
			if (element instanceof Integer || element instanceof Double || element instanceof String) {
				count++; // count each literal
			}
		}

		System.out.println("Total literals in the array: " + count); // Output: 6
	}
}
