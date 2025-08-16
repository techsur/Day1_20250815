package com.day1.languagefundamentals._7varargmethods;

//31. Write a method to calculate sum of N numbers using var-args.
public class Q31VarArgsSum {

	// Method using var-args to calculate sum
	static int sum(int... numbers) {
		int total = 0;
		for (int num : numbers)
			total += num;
		return total;
	}

	public static void main(String[] args) {
		System.out.println("Sum of 3 numbers: " + sum(10, 20, 30)); // Output: 60
		System.out.println("Sum of 5 numbers: " + sum(5, 15, 25, 35, 45)); // Output: 125
		System.out.println("Sum of no numbers: " + sum()); // Output: 0
	}
}


