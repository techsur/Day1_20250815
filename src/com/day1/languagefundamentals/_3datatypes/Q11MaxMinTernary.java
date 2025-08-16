package com.day1.languagefundamentals._3datatypes;

public class Q11MaxMinTernary {

	public static void main(String[] args) {
		int a = 15, b = 25, c = 10;

		// Finding maximum using ternary operator
		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		// Explanation:
		// If a > b → check a > c → max = a or c
		// Else → check b > c → max = b or c

		// Finding minimum using ternary operator
		int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		// Explanation:
		// If a < b → check a < c → min = a or c
		// Else → check b < c → min = b or c

		System.out.println("Numbers: a=" + a + ", b=" + b + ", c=" + c);
		System.out.println("Maximum: " + max); // Output: Maximum: 25
		System.out.println("Minimum: " + min); // Output: Minimum: 10
	}
}
