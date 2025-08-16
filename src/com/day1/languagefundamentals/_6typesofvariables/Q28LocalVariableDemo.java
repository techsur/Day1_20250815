package com.day1.languagefundamentals._6typesofvariables;

public class Q28LocalVariableDemo {

	void show() {
		// Local variables (exist only inside this method)
		int num = 10;
		String message = "Hello, Local Variable!";

		System.out.println("Number: " + num);
		System.out.println("Message: " + message);
	}

	public static void main(String[] args) {
		Q28LocalVariableDemo obj = new Q28LocalVariableDemo();
		obj.show();

		// ❌ The following lines would cause compilation errors because
		// local variables 'num' and 'message' are not accessible outside 'show()'
		// System.out.println(num);
		// System.out.println(message);
	}
}
