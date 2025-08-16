package com.day1.languagefundamentals._9commandlinearguments;

//38. Program to print all command line arguments.
public class Q38CommandLineArgs {

	public static void main(String[] args) {
		System.out.println("Number of arguments: " + args.length);
		System.out.println("Arguments passed:");
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}
