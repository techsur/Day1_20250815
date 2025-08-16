package com.day1.languagefundamentals._8mainmethod;

//36. Overload the main method and demonstrate it.
public class Q36MainOverloadDemo {

	// Standard main method (entry point)
	public static void main(String[] args) {
		System.out.println("Standard main method");

		// Calling overloaded main methods
		main(); // calls main with no parameters
		main(5); // calls main with int parameter
		main("Hello", "World"); // calls main with multiple String parameters
	}

	// Overloaded main method with no parameters
	public static void main() {
		System.out.println("Overloaded main with no parameters");
	}

	// Overloaded main method with int parameter
	public static void main(int num) {
		System.out.println("Overloaded main with int: " + num);
	}

	// Overloaded main method with multiple String parameters
	public static void main(String s1, String s2) {
		System.out.println("Overloaded main with Strings: " + s1 + " " + s2);
	}
}
