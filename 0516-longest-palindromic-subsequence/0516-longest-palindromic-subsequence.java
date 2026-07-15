// class Solution {
//     int[][] dp;
//     public int longestPalindromeSubseq(String s) {
//         dp=new int[s.length()][s.length()];
//         for(int x:dp){
//             Arrays.fill(dp,-1);
//         }
//         return rec(0,s.length()-1,s);
        
//     }
//     public int rec(int i,int j,String s){
//         int ans=0;
//         if(i>j){
//             return 0;
//         }
//         char[] ch=s.toCharArray();
//         if(ch[i]==ch[j]){
//             if(i==j){
//                 ans=Math.max(ans,1+rec(i+1,j-1,s));

//             }else{
//                 ans=Math.max(ans,2+rec(i+1,j-1,s));

//             }
//         }
//         ans=Math.max(ans,rec(i+1,j,s));
//         ans=Math.max(ans,rec(i,j-1,s));
//         return ans;
        
//     }
// }


import java.util.Arrays;

class Solution {
    int[][] dp;

    public int longestPalindromeSubseq(String s) {
        dp = new int[s.length()][s.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return rec(0, s.length() - 1, s);
    }

    public int rec(int i, int j, String s) {
        if (i > j) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int ans = 0;

        if (s.charAt(i) == s.charAt(j)) {
            if (i == j)
                ans = 1 + rec(i + 1, j - 1, s);
            else
                ans = 2 + rec(i + 1, j - 1, s);
        }

        ans = Math.max(ans, rec(i + 1, j, s));
        ans = Math.max(ans, rec(i, j - 1, s));

        return dp[i][j] = ans;
    }
}