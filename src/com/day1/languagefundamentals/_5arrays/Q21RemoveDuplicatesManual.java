package com.day1.languagefundamentals._5arrays;

import java.util.Arrays;

//21.	Remove duplicate elements from an array.
public class Q21RemoveDuplicatesManual {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 20, 40, 10, 50, 30 };
		int n = arr.length;

		int[] temp = new int[n]; // temporary array
		int newLength = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;

			// check if arr[i] already exists in temp
			for (int j = 0; j < newLength; j++) {
				if (arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}

			// if not duplicate, add to temp
			if (!isDuplicate) {
				temp[newLength++] = arr[i];
			}
		}

		// copy only unique elements
		int[] uniqueArr = Arrays.copyOf(temp, newLength);

		// Print result
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
	}
}
