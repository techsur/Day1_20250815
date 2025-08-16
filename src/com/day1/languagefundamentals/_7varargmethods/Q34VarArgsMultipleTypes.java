package com.day1.languagefundamentals._7varargmethods;

//34. Write a program to demonstrate var-args with multiple parameters of different types.
public class Q34VarArgsMultipleTypes {

	// Method with a regular String parameter and var-args of integers
	static void show(String message, int... numbers) {
		System.out.println(message);
		for (int num : numbers)
			System.out.print(num + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		show("Numbers are:"); // No numbers
		show("Some numbers:", 10, 20, 30); // Multiple numbers
		show("More numbers:", 5, 15, 25, 35, 45);
	}
}
