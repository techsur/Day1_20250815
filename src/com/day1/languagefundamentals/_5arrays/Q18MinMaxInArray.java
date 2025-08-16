package com.day1.languagefundamentals._5arrays;

//18.	Find the largest and smallest element in an array.
public class Q18MinMaxInArray {

	public static void main(String[] args) {
		int[] arr = { 20, 30, 70, 5, 90 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

	}
}
