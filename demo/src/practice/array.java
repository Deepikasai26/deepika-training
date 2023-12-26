package practice;
import java.util.Scanner;
public class array {
	private static Scanner sc;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store integers
        int[] numbers;

        // Read the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array with the specified size
        numbers = new int[size];

        // Read elements into the array from the user
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display the elements in the array
        System.out.println("\nElements in the array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
	}
}
        

	

