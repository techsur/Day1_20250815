package com.day1.languagefundamentals._5arrays;

import java.util.Arrays;

//24.	Program to rotate an array by N positions.
public class Q24RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 2; // rotate by 2 positions
		int len = arr.length;
		int[] rotated = new int[len];
		for (int i = 0; i < len; i++)
			rotated[i] = arr[(i + n) % len];
		System.out.println("Original: " + Arrays.toString(arr));
		System.out.println("Rotated: " + Arrays.toString(rotated));
	}
}
