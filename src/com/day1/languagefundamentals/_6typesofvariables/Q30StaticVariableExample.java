package com.day1.languagefundamentals._6typesofvariables;

//Write a program to modify static variable using multiple objects and print results.
public class Q30StaticVariableExample {

	int id; // instance variable
	static String company = "TechCorp"; // static variable shared across all objects

	Q30StaticVariableExample(int empId) {
		id = empId;
	}

	void display() {
		System.out.println("ID: " + id + ", Company: " + company);
	}

	public static void main(String[] args) {
		Q30StaticVariableExample emp1 = new Q30StaticVariableExample(101);
		Q30StaticVariableExample emp2 = new Q30StaticVariableExample(102);

		emp1.display(); // ID: 101, Company: TechCorp
		emp2.display(); // ID: 102, Company: TechCorp

		// Modify static variable using one object
		emp1.company = "CodeSolutions";

		emp1.display(); // ID: 101, Company: CodeSolutions
		emp2.display(); // ID: 102, Company: CodeSolutions

		// Modify static variable using class name (recommended)
		Q30StaticVariableExample.company = "InnovateTech";

		emp1.display(); // ID: 101, Company: InnovateTech
		emp2.display(); // ID: 102, Company: InnovateTech
	}
}

//Recommended way to modify static variables is using ClassName.variable instead of an object reference.