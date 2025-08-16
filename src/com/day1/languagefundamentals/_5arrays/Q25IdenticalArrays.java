package com.day1.languagefundamentals._5arrays;

import java.util.Arrays;

//25.	Program to check if two arrays are identical.
public class Q25IdenticalArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] arr3 = { 1, 2, 3, 5, 4 };

		System.out.println("arr1 & arr2 identical? " + Arrays.equals(arr1, arr2)); // true
		System.out.println("arr1 & arr3 identical? " + Arrays.equals(arr1, arr3)); // false
	}
}
