package practice;

public class BufferString {
	public static void main(String[] args) {
        // Create a String
        String originalString = "Hello, World!";

        // Display the original String
        System.out.println("Original String: " + originalString);

        // Convert String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Display the StringBuffer
        System.out.println("StringBuffer: " + stringBuffer);

        // Read elements from StringBuffer
        char charAtIndex = stringBuffer.charAt(7);
        System.out.println("Character at index 7 in StringBuffer: " + charAtIndex);

        // Convert String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Display the StringBuilder
        System.out.println("StringBuilder: " + stringBuilder);

        // Read elements from StringBuilder
        char charAtIndexBuilder = stringBuilder.charAt(10);
        System.out.println("Character at index 10 in StringBuilder: " + charAtIndexBuilder);
    }

}
