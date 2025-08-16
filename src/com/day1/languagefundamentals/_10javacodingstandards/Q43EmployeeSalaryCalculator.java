package com.day1.languagefundamentals._10javacodingstandards;

//43. Write a program using proper class, method, and variable naming conventions.
public class Q43EmployeeSalaryCalculator { // Class name in PascalCase
	private String employeeName; // Instance variable in camelCase
	private int employeeId; // Instance variable in camelCase
	private double basicSalary; // Instance variable in camelCase

	// Constructor to initialize variables
	public Q43EmployeeSalaryCalculator(String name, int id, double salary) {
		employeeName = name;
		employeeId = id;
		basicSalary = salary;
	}

	// Method to calculate net salary
	public double calculateNetSalary(double bonus, double deduction) {
		return basicSalary + bonus - deduction;
	}

	// Method to display employee details
	public void displayEmployeeDetails(double bonus, double deduction) {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Net Salary: " + calculateNetSalary(bonus, deduction));
	}

	public static void main(String[] args) {
		Q43EmployeeSalaryCalculator emp1 = new Q43EmployeeSalaryCalculator("Alice", 101, 50000);
		emp1.displayEmployeeDetails(5000, 2000); // Bonus 5000, Deduction 2000

		Q43EmployeeSalaryCalculator emp2 = new Q43EmployeeSalaryCalculator("Bob", 102, 60000);
		emp2.displayEmployeeDetails(7000, 3000); // Bonus 7000, Deduction 3000
	}
}
