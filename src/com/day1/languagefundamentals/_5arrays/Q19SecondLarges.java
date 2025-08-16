package com.day1.languagefundamentals._5arrays;

//19.	Find second largest element in an array.
public class Q19SecondLarges {

	public static void main(String[] args) {
		int[] numbers = { 25, 10, 85, 40, 60 };

		// Assume first element as largest and secondLargest
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		// Loop through array
		for (int num : numbers) {
			if (num > largest) {
				secondLargest = largest; // Update second largest
				largest = num; // Update largest
			} else if (num > secondLargest && num != largest) {
				secondLargest = num; // Update second largest
			}
		}

		// Print results
		System.out.println("Largest element: " + largest); // Output: 85
		System.out.println("Second largest element: " + secondLargest); // Output: 60
	}
}
