package com.day1.languagefundamentals._8mainmethod;

//35. Create a program with multiple main methods in different classes and call them.
public class Q35MainClass1 {

	public static void main(String[] args) {
		System.out.println("Inside MainClass1 main method");

		// Call main of another class
		String[] arr = { "Hello", "from MainClass2" };
		MainClass2.main(arr);
	}
}

class MainClass2 {
	public static void main(String[] args) {
		System.out.println("Inside MainClass2 main method");
		System.out.println("Arguments passed:");
		for (String s : args)
			System.out.print(s + " ");
		System.out.println();
	}
}
