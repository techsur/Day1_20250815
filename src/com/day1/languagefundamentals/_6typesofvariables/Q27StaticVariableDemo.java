package com.day1.languagefundamentals._6typesofvariables;

//27. Write a class to demonstrate static variables shared across objects.
public class Q27StaticVariableDemo {

	int id; // instance variable
	String name; // instance variable
	static String company = "TechCorp"; // static variable (shared)

	Q27StaticVariableDemo(int empId, String empName) {
		id = empId;
		name = empName;
	}

	void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Company: " + company);
	}

	public static void main(String[] args) {
		Q27StaticVariableDemo emp1 = new Q27StaticVariableDemo(101, "Alice");
		Q27StaticVariableDemo emp2 = new Q27StaticVariableDemo(102, "Bob");

		emp1.display(); // ID: 101, Name: Alice, Company: TechCorp
		emp2.display(); // ID: 102, Name: Bob, Company: TechCorp

		// Changing static variable using one object
		emp1.company = "CodeSolutions";

		//Changing company through one object affects all objects.
		emp1.display(); // ID: 101, Name: Alice, Company: CodeSolutions
		emp2.display(); // ID: 102, Name: Bob, Company: CodeSolutions
	}
}
