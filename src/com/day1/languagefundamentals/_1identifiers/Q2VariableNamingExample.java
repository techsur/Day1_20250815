package com.day1.languagefundamentals._1identifiers;

public class Q2VariableNamingExample {

	public static void main(String[] args) {

		// camelCase: first word lowercase, next words capitalized
		int studentAge = 20;
		
		// PascalCase: every word capitalized (usually used for class names, but allowed
		// for variables)
		double StudentSalary = 250000.00;
		
		// snake_case: words separated by underscores
		String student_name = "Sriram";

		System.out.println("Student Age: " + studentAge);
		System.out.println("Student Salary: " + StudentSalary);
		System.out.println("Student Name:" + student_name);
	}

}
