package com.day1.languagefundamentals._10javacodingstandards;

//45. Program demonstrating consistent braces placement (K&R vs Allman).
public class Q45AllmanStyle {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int sum = a + b;
		int product = a * b;

		if (sum > product) {
			System.out.println("Sum is greater");
		} else {
			System.out.println("Product is greater");
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("Allman loop iteration: " + i);
		}
	}
}
