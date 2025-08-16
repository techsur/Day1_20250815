package com.day1.languagefundamentals._9commandlinearguments;

//42. Program to count number of vowels in command line arguments.
public class Q42VowelCountCLI {

	public static void main(String[] args) {
		int count = 0;
		for (String arg : args) {
			for (char ch : arg.toLowerCase().toCharArray()) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}
			}
		}
		System.out.println("Total vowels: " + count);
	}
}
