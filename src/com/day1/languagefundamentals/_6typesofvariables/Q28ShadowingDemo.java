package com.day1.languagefundamentals._6typesofvariables;

public class Q28ShadowingDemo {

	// Instance variable
	int num = 50;

	void show() {
		// Local variable with the same name (shadows instance variable)
		int num = 10;

		System.out.println("Local variable num: " + num); // Prints local variable
		System.out.println("Instance variable num: " + this.num); // Access instance variable using 'this'
	}

	public static void main(String[] args) {
		Q28ShadowingDemo obj = new Q28ShadowingDemo();
		obj.show();
	}
}

