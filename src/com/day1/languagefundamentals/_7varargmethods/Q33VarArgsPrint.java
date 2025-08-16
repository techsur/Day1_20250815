package com.day1.languagefundamentals._7varargmethods;

//33. Write a method to print all elements passed via var-args.
public class Q33VarArgsPrint {

	// Method to print any number of elements
	static void printElements(int... numbers) {
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println(); // move to next line after printing
	}

	public static void main(String[] args) {
		printElements(10, 20, 30); // Output: 10 20 30
		printElements(5, 15, 25, 35, 45); // Output: 5 15 25 35 45
		printElements(); // Output: (prints nothing)
	}
}
