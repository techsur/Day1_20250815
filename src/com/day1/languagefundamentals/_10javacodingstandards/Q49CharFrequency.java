package com.day1.languagefundamentals._10javacodingstandards;

import java.util.HashMap;
import java.util.Scanner;

//49. Program to count frequency of each character in a string.
public class Q49CharFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// HashMap to store frequency of each character
		HashMap<Character, Integer> freqMap = new HashMap<>();

		// Iterate through each character
		for (char ch : input.toCharArray()) {
			if (freqMap.containsKey(ch)) {
				freqMap.put(ch, freqMap.get(ch) + 1); // Increment count
			} else {
				freqMap.put(ch, 1); // First occurrence
			}
		}

		// Print frequencies
		System.out.println("Character frequencies:");
		for (char key : freqMap.keySet()) {
			System.out.println(key + ": " + freqMap.get(key));
		}
	}
}
