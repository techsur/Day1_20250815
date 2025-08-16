package com.day1.languagefundamentals._5arrays;

//22.	Count occurrences of a particular element in an array.
public class Q22CountOccurrences {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 40, 10, 50, 20 };
		int target = 10, count = 0;
		for (int num : arr)
			if (num == target)
				count++;
		System.out.println("Element " + target + " occurs " + count + " times.");
	}
}
