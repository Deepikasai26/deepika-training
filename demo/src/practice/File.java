package practice;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class File {

	    public static void main(String[] args) {
	        String filePath = "example.txt";

	        // Write to file
	        writeToFile(filePath, "Hello, this is a sample text.");

	        // Read from file
	        String content = readFromFile(filePath);
	        System.out.println("Content read from file:\n" + content);

	        // Append to file
	        appendToFile(filePath, "\nAppending more text to the file.");

	        // Read the file after appending
	        content = readFromFile(filePath);
	        System.out.println("Content after appending:\n" + content);
	    }

	    private static void writeToFile(String filePath, String content) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	            writer.write(content);
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static String readFromFile(String filePath) {
	        StringBuilder content = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return content.toString();
	    }

	    private static void appendToFile(String filePath, String content) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
	            writer.write(content);
	            System.out.println("Successfully appended to the file.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
