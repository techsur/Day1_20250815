package com.day1.languagefundamentals._9commandlinearguments;

//39. Program to calculate sum of numbers passed via command line arguments.
public class Q39SumCommandLine {

	public static void main(String[] args) {
		int sum = 0;
		for (String arg : args) {
			sum += Integer.parseInt(arg); // Convert each argument from String to int
		}
		System.out.println("Sum of numbers: " + sum);
	}
}
