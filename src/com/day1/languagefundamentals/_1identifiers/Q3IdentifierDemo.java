package com.day1.languagefundamentals._1identifiers;

public class Q3IdentifierDemo {
	public static void main(String[] args) {
		// ✅ Valid identifiers
		int age = 25; // starts with a letter
		int _count = 10; // starts with underscore
		int $total = 50; // starts with dollar sign
		int number1 = 100; // contains letters and digits
		String userName = "Naveen"; // camelCase, valid

		// ❌ Invalid identifiers (commented out)
		// int 1age = 30; // ❌ starts with a digit
		// int total-amount = 500; // ❌ contains hyphen (-), not allowed
		// int class = 10; // ❌ 'class' is a reserved keyword
		// int my name = 20; // ❌ contains space
		// int @score = 90; // ❌ contains special character '@', not allowed

		// Printing valid identifiers
		System.out.println("Age: " + age);
		System.out.println("Count: " + _count);
		System.out.println("Total: " + $total);
		System.out.println("Number1: " + number1);
		System.out.println("User Name: " + userName);
	}
}
