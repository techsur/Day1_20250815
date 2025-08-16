package com.day1.languagefundamentals._10javacodingstandards;

//50. Program to implement simple calculator using command line arguments and switch-case.
public class Q50CalculatorCLI {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java CalculatorCLI <num1> <operator> <num2>");
			System.out.println("Example: java CalculatorCLI 10 + 20");
			return;
		}

		double num1 = Double.parseDouble(args[0]);
		String operator = args[1];
		double num2 = Double.parseDouble(args[2]);
		double result = 0;

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Error: Division by zero!");
				return;
			}
			break;
		default:
			System.out.println("Invalid operator! Use +, -, *, or /");
			return;
		}

		System.out.println("Result: " + result);
	}
}
