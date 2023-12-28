package com.inhertiance;
	import java.util.Scanner;
	// Encapsulation: Using a class to encapsulate data and behavior
	class Person {
	    private String name;
	    private int age;
	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    // Getter and setter methods for name
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and setter methods for age
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if (age >= 0) {
	            this.age = age;
	        } else {
	            System.out.println("Age cannot be negative.");
	        }
	    }

	    // Abstraction
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	// Inheritance
	class Student extends Person {
	    private int studentId;

	    // Constructor
	    public Student(String name, int age, int studentId) {
	        super(name, age);
	        this.studentId = studentId;
	    }

	    // Polymorphism
	    public void displayInfo() {
	        super.displayInfo(); // Call the displayInfo method of the superclass
	        System.out.println("Student ID: " + studentId);
	    }
	}

	// Main class
	public class objectoriented {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking user input to create a Person
	        System.out.print("Enter the person's name: ");
	        String personName = scanner.nextLine();

	        System.out.print("Enter the person's age: ");
	        int personAge = scanner.nextInt();

	        Person person = new Person(personName, personAge);

	        // Taking user input to create a Student
	        System.out.print("Enter the student's name: ");
	        scanner.nextLine(); // Consume the newline character
	        String studentName = scanner.nextLine();

	        System.out.print("Enter the student's age: ");
	        int studentAge = scanner.nextInt();

	        System.out.print("Enter the student's ID: ");
	        int studentId = scanner.nextInt();

	        Student student = new Student(studentName, studentAge, studentId);

	        // Demonstrate encapsulation
	        System.out.println("\nPerson's Information:");
	        person.displayInfo();

	        System.out.println("\nStudent's Information:");
	        student.displayInfo();

	        scanner.close();
	    }
}
