package demo;

public class Fixbugs {

	    // TODO: Identify and fix bugs based on the testing team's reports

	    public static void main(String[] args) {
	        // Example usage of the fixed code
	        int[] inputArray = {1, 2, 3, 4, 5};
	        int targetValue = 3;

	        // Call the fixed method
	        int result = findTargetIndex(inputArray, targetValue);

	        // Display the result
	        if (result != -1) {
	            System.out.println("Target value found at index: " + result);
	        } else {
	            System.out.println("Target value not found in the array.");
	        }
	    }

	    /**
	     * Fix the bug(s) in this method based on the testing team's reports.
	     *
	     * @param array The input array in which to find the target value.
	     * @param target The target value to be found in the array.
	     * @return The index of the target value in the array or -1 if not found.
	     */
	    private static int findTargetIndex(int[] array, int target) {
	        // TODO: Fix bugs in this method
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    // TODO: Add more methods or make modifications as needed based on the bug reports
	}

