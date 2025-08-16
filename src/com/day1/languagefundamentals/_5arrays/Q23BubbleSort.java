package com.day1.languagefundamentals._5arrays;

import java.util.Arrays;

//23.	Write a program to sort an array using bubble sort.
public class Q23BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}
}
