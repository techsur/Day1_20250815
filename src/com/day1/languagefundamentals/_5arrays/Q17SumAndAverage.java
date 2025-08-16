package com.day1.languagefundamentals._5arrays;

//17.	Find the sum and average of array elements.
public class Q17SumAndAverage {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum: "+sum);

		double average = (double) sum / arr.length;
		System.out.println("Average: "+average);
	}

}
