package datastructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static List<Integer> findLongestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLength = 1;
        int endIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;

                    if (dp[i] > maxLength) {
                        maxLength = dp[i];
                        endIndex = i;
                    }
                }
            }
        }

        List<Integer> longestIncreasingSubsequence = new ArrayList<>();
        longestIncreasingSubsequence.add(nums[endIndex]);

        for (int i = endIndex - 1; i >= 0; i--) {
            if (nums[i] < nums[endIndex] && dp[i] == dp[endIndex] - 1) {
                longestIncreasingSubsequence.add(nums[i]);
                endIndex = i;
            }
        }

        // Reverse the list to get the correct order
        List<Integer> reversedSubsequence = new ArrayList<>();
        for (int i = longestIncreasingSubsequence.size() - 1; i >= 0; i--) {
            reversedSubsequence.add(longestIncreasingSubsequence.get(i));
        }

        return reversedSubsequence;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the number of elements: ");
			int n = scanner.nextInt();

			int[] nums = new int[n];

			System.out.println("Enter the elements:");

			for (int i = 0; i < n; i++) {
			    nums[i] = scanner.nextInt();
			}

			List<Integer> longestIncreasingSubsequence = findLongestIncreasingSubsequence(nums);

			System.out.println("Longest Increasing Subsequence: " + longestIncreasingSubsequence);
		}
    }
}

