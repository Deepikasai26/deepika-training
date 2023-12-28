package demo;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
public class crud {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the file name: ");
	        String fileName = scanner.nextLine();

	        while (true) {
	            System.out.println("Choose operation:");
	            System.out.println("1. Create file");
	            System.out.println("2. Read file");
	            System.out.println("3. Update file");
	            System.out.println("4. Delete file");
	            System.out.println("5. Exit");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    createFile(fileName);
	                    break;
	                case 2:
	                    readFile(fileName);
	                    break;
	                case 3:
	                    updateFile(fileName);
	                    break;
	                case 4:
	                    deleteFile(fileName);
	                    break;
	                case 5:
	                    scanner.close();
	                    System.out.println("Exiting program.");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }
	        }
	    }

	    private static void createFile(String fileName) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	            System.out.println("Enter content to write to the file:");
	            try (Scanner scanner = new Scanner(System.in)) {
					String content = scanner.nextLine();
					writer.write(content);
				}
	            System.out.println("File created successfully.");
	        } catch (IOException e) {
	            System.out.println("Error creating file: " + e.getMessage());
	        }
	    }

	    private static void readFile(String fileName) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            System.out.println("File content:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }

	    private static void updateFile(String fileName) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
	            System.out.println("Enter content to append to the file:");
	            try (Scanner scanner = new Scanner(System.in)) {
					String content = scanner.nextLine();
					writer.newLine();
					writer.write(content);
				}
	            System.out.println("File updated successfully.");
	        } catch (IOException e) {
	            System.out.println("Error updating file: " + e.getMessage());
	        }
	    }

	    private static void deleteFile(String fileName) {
	        File file = new File(fileName);
	        if (file.exists()) {
	            if (file.delete()) {
	                System.out.println("File deleted successfully.");
	            } else {
	                System.out.println("Unable to delete the file.");
	            }
	        } else {
	            System.out.println("File does not exist.");
	        }
	    }

}
