package com.day1.languagefundamentals._3datatypes;

public class Q10SwapDifferentType {

	public static void main(String[] args) {
		int intNum = 10;
		double doubleNum = 25.5;

		System.out.println("Before swapping:");
		System.out.println("intNum = " + intNum + ", doubleNum = " + doubleNum);
		// Output: intNum = 10, doubleNum = 25.5

		// Swapping using a temporary variable
		double temp = doubleNum; // temp stores doubleNum
		doubleNum = intNum; // intNum converted to double automatically
		intNum = (int) temp; // cast temp back to int

		System.out.println("\nAfter swapping:");
		System.out.println("intNum = " + intNum + ", doubleNum = " + doubleNum);
		// Output: intNum = 25, doubleNum = 10.0
	}
}
