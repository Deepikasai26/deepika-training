package practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.*;

public class RegularExpression {

	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Read the regular expression from the user
	        System.out.print("Enter the regular expression: ");
	        String regex = scanner.nextLine();

	        // Read the input strings from the user
	        System.out.print("Enter input string 1: ");
	        String input1 = scanner.nextLine();

	        System.out.print("Enter input string 2: ");
	        String input2 = scanner.nextLine();

	        // Verify regular expression using Pattern class
	        verifyPattern(regex, input1);
	        verifyPattern(regex, input2);

	        // Verify regular expression using Matcher class
	        verifyMatcher(regex, input1);
	        verifyMatcher(regex, input2);

	        // Verify regular expression using PatternSyntaxException class
	        verifyPatternSyntaxException(regex);

	        // Close the Scanner
	        scanner.close();
	    }

	    // Method to verify regular expression using Pattern class
	    private static void verifyPattern(String regex, String input) {
	        Pattern pattern = Pattern.compile(regex);
	        boolean matches = pattern.matcher(input).matches();
	        System.out.println("Using Pattern class - Input: " + input + ", Matches: " + matches);
	    }

	    // Method to verify regular expression using Matcher class
	    private static void verifyMatcher(String regex, String input) {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);
	        boolean matches = matcher.matches();
	        System.out.println("Using Matcher class - Input: " + input + ", Matches: " + matches);

	        // Additional demonstration of finding matches
	        if (matches) {
	            while (matcher.find()) {
	                System.out.println("Match found at index " + matcher.start() + " - " + matcher.group());
	            }
	        }
	    }

	    // Method to verify regular expression using PatternSyntaxException class
	    private static void verifyPatternSyntaxException(String regex) {
	        try {
	            Pattern.compile(regex);
	        } catch (PatternSyntaxException e) {
	            System.out.println("Using PatternSyntaxException class - Invalid regular expression: " + e.getDescription());
	        }
	    } 
}
	