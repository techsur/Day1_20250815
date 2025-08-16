package com.day1.languagefundamentals._3datatypes;

public class Q9PrimitiveOperationsDemo {

	public static void main(String[] args) {
		// Using int
		int a = 10, b = 20;
		int sumInt = a + b; // Sum: 30
		int productInt = a * b; // Product: 200
		double averageInt = (a + b) / 2.0; // Average: 15.0

		System.out.println("Using int:");
		System.out.println("Sum: " + sumInt); // Output: Sum: 30
		System.out.println("Product: " + productInt); // Output: Product: 200
		System.out.println("Average: " + averageInt); // Output: Average: 15.0

		// Using float
		float x = 5.5f, y = 2.5f;
		float sumFloat = x + y; // Sum: 8.0
		float productFloat = x * y; // Product: 13.75
		float averageFloat = (x + y) / 2; // Average: 4.0

		System.out.println("\nUsing float:");
		System.out.println("Sum: " + sumFloat); // Output: Sum: 8.0
		System.out.println("Product: " + productFloat); // Output: Product: 13.75
		System.out.println("Average: " + averageFloat); // Output: Average: 4.0

		// Using double
		double p = 12.75, q = 3.25;
		double sumDouble = p + q; // Sum: 16.0
		double productDouble = p * q; // Product: 41.4375
		double averageDouble = (p + q) / 2; // Average: 8.0

		System.out.println("\nUsing double:");
		System.out.println("Sum: " + sumDouble); // Output: Sum: 16.0
		System.out.println("Product: " + productDouble); // Output: Product: 41.4375
		System.out.println("Average: " + averageDouble); // Output: Average: 8.0
	}
}
