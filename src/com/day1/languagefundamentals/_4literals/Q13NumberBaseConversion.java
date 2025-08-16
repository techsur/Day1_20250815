package com.day1.languagefundamentals._4literals;

public class Q13NumberBaseConversion {

	public static void main(String[] args) {
		int number = 42; // integer literal

		// Converting to binary
		String binary = Integer.toBinaryString(number);
		// Converting to octal
		String octal = Integer.toOctalString(number);
		// Converting to hexadecimal
		String hex = Integer.toHexString(number);

		// Printing the results
		System.out.println("Number: " + number); // Output: Number: 42
		System.out.println("Binary: " + binary); // Output: Binary: 101010
		System.out.println("Octal: " + octal); // Output: Octal: 52
		System.out.println("Hexadecimal: " + hex); // Output: Hexadecimal: 2a
	}
}
