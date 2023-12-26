package practice;
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Construct {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read data for the default constructor
        System.out.println("Enter details for Person with Default Constructor:");
        Person person1 = new Person();
        System.out.print("Enter name: ");
        person1 = new Person(scanner.nextLine(), person1.getAge());
        System.out.print("Enter age: ");
        person1 = new Person(person1.getName(), scanner.nextInt());
        scanner.nextLine(); // Consume the newline character

        // Read data for the parameterized constructor
        System.out.println("\nEnter details for Person with Parameterized Constructor:");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        Person person2 = new Person(name, age);

        // Test copy constructor
        Person person3 = new Person(person2);

        // Display the details of each person
        System.out.println("\nDetails of Person with Default Constructor:");
        displayPersonDetails(person1);

        System.out.println("\nDetails of Person with Parameterized Constructor:");
        displayPersonDetails(person2);

        System.out.println("\nDetails of Person with Copy Constructor (from Person with Parameterized Constructor):");
        displayPersonDetails(person3);

        // Close the scanner
        scanner.close();
    }

    private static void displayPersonDetails(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println();
    }
}

