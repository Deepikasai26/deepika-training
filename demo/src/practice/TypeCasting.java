package practice;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);{
			        // Implicit casting (widening)
			        int intValue;
			        System.out.println("Enter integer number: ");
					intValue = SC.nextInt();
			        double doubleValue = intValue; // Automatically cast int to double
			        System.out.println("Implicit Casting (Widening):");
			        System.out.println("int value: " + intValue);
			        System.out.println("double value: " + doubleValue);
			        System.out.println();

			        // Explicit casting (narrowing)
			        double anotherDoubleValue;
			        System.out.println("Enter double value: ");
		            double anotherDoubleValue1 = SC.nextDouble();
			        int anotherIntValue = (int) anotherDoubleValue1; // Explicitly cast double to int
			        System.out.println("Explicit Casting (Narrowing):");
			        System.out.println("double value: " + anotherDoubleValue1);
			        System.out.println("int value: " + anotherIntValue);
			    }
			}
	

}
