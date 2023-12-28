package demo;

	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class EmailValidator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an email address: ");
	        String email = scanner.nextLine();

	        if (isValidEmail(email)) {
	            System.out.println("The email address is valid.");
	        } else {
	            System.out.println("The email address is invalid.");
	        }

	        scanner.close();
	    }

	    public static boolean isValidEmail(String email) {
	        // Define a regular expression for a basic email validation
	        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

	        // Create a Pattern object
	        Pattern pattern = Pattern.compile(emailRegex);

	        // Create matcher object
	        Matcher matcher = pattern.matcher(email);

	        // Return true if the email matches the pattern, otherwise false
	        return matcher.matches();
	    }
	}


