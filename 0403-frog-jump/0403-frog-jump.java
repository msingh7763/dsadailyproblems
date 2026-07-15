class Solution {

    Boolean[][] dp;

    public boolean canCross(int[] stones) {

        if (stones[1] != 1)
            return false;
        int n=stones.length;
        dp = new Boolean[n][n + 1];

        return rec(1, 1, stones);
    }

    public boolean rec(int i, int k, int[] stones) {

        int n = stones.length;

        if (i == n - 1)
            return true;

        if (dp[i][k] != null)
            return dp[i][k];

        for(int j=i+1;j<n;j++) {

            int diff=stones[j]-stones[i];

            if(diff < k - 1)
                continue;
            if(diff > k + 1)
                break;

            if (rec(j, diff, stones))
                return dp[i][k] = true;
        }

        return dp[i][k] = false;
    }
}