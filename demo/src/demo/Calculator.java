package demo;
	import java.util.Scanner;

	public class Calculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Simple Arithmetic Calculator");
	        System.out.println("----------------------------");

	        while (true) {
	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Enter operator (+, -, *, /): ");
	            char operator = scanner.next().charAt(0);

	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            double result = calculate(num1, operator, num2);

	            System.out.println("Result: " + result);

	            System.out.print("Do you want to perform another calculation? (yes/no): ");
	            String continueCalculation = scanner.next().toLowerCase();

	            if (!continueCalculation.equals("yes")) {
	                System.out.println("Goodbye!");
	                break;
	            }
	        }

	        scanner.close();
	    }

	    public static double calculate(double num1, char operator, double num2) {
	        switch (operator) {
	            case '+':
	                return num1 + num2;
	            case '-':
	                return num1 - num2;
	            case '*':
	                return num1 * num2;
	            case '/':
	                if (num2 != 0) {
	                    return num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    return Double.NaN; // Not a Number
	                }
	            default:
	                System.out.println("Error: Invalid operator.");
	                return Double.NaN;
	        }
	    }
	}
