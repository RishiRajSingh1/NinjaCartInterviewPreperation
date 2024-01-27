public class LongestPalindromicSubsequence {

    public static void main(String[] args) {
        String str = "bbbab";

        int result = longestPalindromeSubseq(str);

        System.out.println("Length of the Longest Palindromic Subsequence: " + result);
    }

    public static int longestPalindromeSubseq(String str) {
        int n = str.length();

        // Create a 2D array to store the lengths of the palindromic subsequences
        int[][] dp = new int[n][n];

        // Initialize the diagonal elements with 1 (single character is a palindrome)
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill the array in a bottom-up manner
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (str.charAt(i) == str.charAt(j) && len == 2) {
                    dp[i][j] = 2;
                } else if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        // The length of the Longest Palindromic Subsequence is stored at dp[0][n-1]
        return dp[0][n - 1];
    }
}
