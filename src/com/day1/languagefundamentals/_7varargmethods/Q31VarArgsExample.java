package com.day1.languagefundamentals._7varargmethods;

public class Q31VarArgsExample {

	// Method with one regular parameter and var-args
	static void greet(String greeting, String... names) {
		System.out.println(greeting);
		for (String name : names) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		greet("Hello everyone!"); // No names
		System.out.println("---");
		greet("Hello friends!", "Alice", "Bob", "Charlie"); // Multiple names
	}
}
