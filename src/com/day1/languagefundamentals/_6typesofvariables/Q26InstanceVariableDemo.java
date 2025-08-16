package com.day1.languagefundamentals._6typesofvariables;

//26. Write a class to demonstrate instance variables.
public class Q26InstanceVariableDemo {

	// Instance variables (each object gets its own copy)
	int id;
	String name;
	double salary;

	// Constructor to initialize instance variables
	public Q26InstanceVariableDemo(int empId, String empName, double empSalary) {
	        id = empId;
	        name = empName;
	        salary = empSalary;
	    }

	// Method to display values
	void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	}

	public static void main(String[] args) {
		// Creating objects (each has its own instance variables)
		Q26InstanceVariableDemo emp1 = new Q26InstanceVariableDemo(101, "Alice", 50000);
		Q26InstanceVariableDemo emp2 = new Q26InstanceVariableDemo(102, "Bob", 60000);

		emp1.display(); // ID: 101, Name: Alice, Salary: 50000.0
		emp2.display(); // ID: 102, Name: Bob, Salary: 60000.0
	}
}
