package com.day1.languagefundamentals._9commandlinearguments;

//40. Program to find max and min from command line arguments.
public class Q40MaxMinCommandLine {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No numbers provided!");
			return;
		}

		int max = Integer.parseInt(args[0]);
		int min = Integer.parseInt(args[0]);

		for (String arg : args) {
			int num = Integer.parseInt(arg);
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}

		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}
}
