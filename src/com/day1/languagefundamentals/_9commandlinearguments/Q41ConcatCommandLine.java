package com.day1.languagefundamentals._9commandlinearguments;

//41. Program to concatenate all command line arguments into a single string.
public class Q41ConcatCommandLine {

	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		for (String arg : args) {
			result.append(arg); // append each argument
		}
		System.out.println("Concatenated String: " + result.toString());
	}
}
