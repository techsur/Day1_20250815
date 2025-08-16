package com.day1.languagefundamentals._7varargmethods;

//32. Write a method to find maximum element among N numbers using var-args.
public class Q32VarArgsMax {

	// Method using var-args to find maximum
	static int max(int... numbers) {
		if (numbers.length == 0)
			return Integer.MIN_VALUE; // handle no input
		int maxVal = numbers[0];
		for (int num : numbers) {
			if (num > maxVal)
				maxVal = num;
		}
		return maxVal;
	}

	public static void main(String[] args) {
		System.out.println("Maximum of 3 numbers: " + max(10, 20, 30)); // Output: 30
		System.out.println("Maximum of 5 numbers: " + max(5, 15, 25, 35, 45)); // Output: 45
		System.out.println("Maximum of no numbers: " + max()); // Output: -2147483648
	}
}
