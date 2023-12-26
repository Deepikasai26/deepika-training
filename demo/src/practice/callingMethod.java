package practice;
import java.util.Scanner;
public class callingMethod {
	public void simpleMethod() {
        System.out.println("Simple method called");
    }

    // Method with parameters and no return value
    public void methodWithParameters(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Method with parameters and a return value
    public int add(int a, int b) {
        return a + b;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        callingMethod verifier = new callingMethod();

        // Calling a method with no parameters and no return value
        verifier.simpleMethod();

        // Calling a method with parameters and no return value by reading input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int input1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int input2 = scanner.nextInt();
        verifier.methodWithParameters(input1, input2);

        // Calling a method with parameters and a return value
        int result = verifier.add(3, 4);
        System.out.println("Result of addition: " + result);

        // Calling a static method (no need to create an instance)
        staticMethod();

        // Calling a static method using the class name
        callingMethod.staticMethod();

        // Close the Scanner
        scanner.close();
    }
}

