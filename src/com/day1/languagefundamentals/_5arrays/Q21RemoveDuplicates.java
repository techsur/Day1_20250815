package com.day1.languagefundamentals._5arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

//21.	Remove duplicate elements from an array.
public class Q21RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 20, 40, 10, 50, 30 };

		// Use LinkedHashSet to preserve insertion order
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		// Convert set back to array
		int[] uniqueArr = new int[set.size()];
		int i = 0;
		for (int num : set) {
			uniqueArr[i++] = num;
		}

		// Print result
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
	}
}
