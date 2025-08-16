package com.day1.languagefundamentals._5arrays;

import java.util.Arrays;

//20.	Merge two arrays into one.
public class Q20MergeArrays {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 40, 50, 60, 70 };

		// New array size = sum of lengths
		int[] merged = new int[arr1.length + arr2.length];

		// Copy arr1 elements
		for (int i = 0; i < arr1.length; i++) {
			merged[i] = arr1[i];
		}

		// Copy arr2 elements after arr1
		for (int i = 0; i < arr2.length; i++) {
			merged[arr1.length + i] = arr2[i];
		}

		// Print merged array
		System.out.println("Merged Array: " + Arrays.toString(merged));
	}
}
