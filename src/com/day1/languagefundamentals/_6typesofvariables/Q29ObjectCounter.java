package com.day1.languagefundamentals._6typesofvariables;

public class Q29ObjectCounter {

	// static variable shared by all objects
	static int count = 0;

	// Constructor increments count whenever object is created
	Q29ObjectCounter() {
		count++;
	}

	public static void main(String[] args) {
		Q29ObjectCounter obj1 = new Q29ObjectCounter();
		Q29ObjectCounter obj2 = new Q29ObjectCounter();
		Q29ObjectCounter obj3 = new Q29ObjectCounter();

		System.out.println("Total objects created: " + Q29ObjectCounter.count);
	}
}
