class Solution {
    int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        dp = new int[n][m];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, 0, text1, text2);
    }

    public int solve(int i, int j, String text1, String text2) {

        if (i == text1.length() || j == text2.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + solve(i + 1, j + 1, text1, text2);
        }

        return dp[i][j] = Math.max(
                solve(i + 1, j, text1, text2),
                solve(i, j + 1, text1, text2)
        );
    }
}