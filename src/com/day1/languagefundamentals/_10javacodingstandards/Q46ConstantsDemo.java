package com.day1.languagefundamentals._10javacodingstandards;

//46. Program following proper constants naming (static final) convention.
public class Q46ConstantsDemo {

	// Constants in UPPER_CASE with underscores
	static final double PI = 3.14159;
	static final int MAX_USERS = 100;
	static final String COMPANY_NAME = "TechCorp";

	public static void main(String[] args) {
		System.out.println("Value of PI: " + PI);
		System.out.println("Maximum Users Allowed: " + MAX_USERS);
		System.out.println("Company Name: " + COMPANY_NAME);

		// Trying to change a constant will cause a compilation error
		// PI = 3.14; // ❌ Error: cannot assign a value to final variable PI
	}
}
