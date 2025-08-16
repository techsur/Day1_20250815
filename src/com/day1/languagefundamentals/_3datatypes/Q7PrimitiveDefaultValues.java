package com.day1.languagefundamentals._3datatypes;

public class Q7PrimitiveDefaultValues {

	// Instance variables (have default values)
	byte byteVar;
	short shortVar;
	int intVar;
	long longVar;
	float floatVar;
	double doubleVar;
	char charVar;
	boolean booleanVar;

	public void printDefaultValues() {
		System.out.println("Default byte value: " + byteVar);
		System.out.println("Default short value: " + shortVar);
		System.out.println("Default int value: " + intVar);
		System.out.println("Default long value: " + longVar);
		System.out.println("Default float value: " + floatVar);
		System.out.println("Default double value: " + doubleVar);
		System.out.println("Default char value: '" + charVar + "'"); // prints empty character
		System.out.println("Default boolean value: " + booleanVar);
	}

	public static void main(String[] args) {
		Q7PrimitiveDefaultValues obj = new Q7PrimitiveDefaultValues();
		obj.printDefaultValues();
	}
}
