package com.day1.languagefundamentals._10javacodingstandards;

import java.util.Scanner;

//48. Program to check palindrome numbers using arrays.
public class Q48PalindromeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;

		// Count number of digits
		int count = 0;
		int t = temp;
		while (t != 0) {
			t /= 10;
			count++;
		}

		// Store digits in an array
		int[] digits = new int[count];
		for (int i = count - 1; i >= 0; i--) {
			digits[i] = temp % 10;
			temp /= 10;
		}

		// Check palindrome
		boolean isPalindrome = true;
		for (int i = 0; i < count / 2; i++) {
			if (digits[i] != digits[count - 1 - i]) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println(num + " is a palindrome number.");
		} else {
			System.out.println(num + " is not a palindrome number.");
		}
	}
}
