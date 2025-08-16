package com.day1.languagefundamentals._5arrays;

//16.	Create an array of integers and print it in reverse.
public class Q16ReverseArrayDemo {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int n = arr.length;

		System.out.println("Print in forward direction");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println("\nPrint in reverse direction");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");

		}

	}
}
