package com.day1.languagefundamentals._10javacodingstandards;

//44. Program demonstrating proper indentation and comments for readability.
public class Q44ReadableProgram {

	// Main method - program entry point
	public static void main(String[] args) {

		// Declare and initialize variables
		int num1 = 10; // first number
		int num2 = 20; // second number

		// Calculate sum, difference, product, and quotient
		int sum = num1 + num2; // addition
		int difference = num2 - num1; // subtraction
		int product = num1 * num2; // multiplication
		double quotient = (double) num2 / num1; // division

		// Print results with clear messages
		System.out.println("Number 1: " + num1);
		System.out.println("Number 2: " + num2);
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
	}
}
