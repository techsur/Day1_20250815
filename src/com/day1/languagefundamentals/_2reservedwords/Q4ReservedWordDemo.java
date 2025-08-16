package com.day1.languagefundamentals._2reservedwords;

public class Q4ReservedWordDemo {

	public static void main(String[] args) {
		// ✅ Valid variable
		int age = 25;

		// ❌ Invalid variables (reserved keywords cannot be used as identifiers)
		// int class = 10; // ❌ 'class' is a reserved keyword
		// int int = 50; // ❌ 'int' is a reserved keyword
		// double if = 20.5; // ❌ 'if' is a reserved keyword
		// boolean for = true; // ❌ 'for' is a reserved keyword

		// Printing valid variable
		System.out.println("Age: " + age);
	}
}