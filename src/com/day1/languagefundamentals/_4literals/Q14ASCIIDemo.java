package com.day1.languagefundamentals._4literals;

public class Q14ASCIIDemo {

	public static void main(String[] args) {
		System.out.println("ASCII values of characters from 0 to 127:");

		// Loop through ASCII values
		for (int i = 0; i <= 127; i++) {
			char ch = (char) i; // convert integer to char
			System.out.println("Character: '" + ch + "' \tASCII: " + i);
		}
	}
}
