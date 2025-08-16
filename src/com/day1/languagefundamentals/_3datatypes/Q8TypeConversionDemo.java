package com.day1.languagefundamentals._3datatypes;

public class Q8TypeConversionDemo {

	public static void main(String[] args) {
		// Step 1: int
		int intVar = 100;
		System.out.println("Integer value: " + intVar);

		// Step 2: int to float (automatic widening)
		float floatVar = intVar;
		System.out.println("Converted to float: " + floatVar);

		// Step 3: float to double (automatic widening)
		double doubleVar = floatVar;
		System.out.println("Converted to double: " + doubleVar);

		// Step 4: double to long (requires explicit casting)
		long longVar = (long) doubleVar;
		System.out.println("Converted to long: " + longVar);
	}
}
