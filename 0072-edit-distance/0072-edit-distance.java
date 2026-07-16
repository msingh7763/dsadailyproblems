// class Solution {

//     public int minDistance(String word1, String word2) {
//         int[][] dp=new int[word1.length()][word2.length()]
//         return rec(0,0,word1,word2);
        


//     }
//     public int rec(int i, int j,String word1, String word2){
        
//         int n=word1.length();
//         int m=word2.length();
//         if(i>=n)return m-j;
//         if(j>=m)return n-i;
//         int ans=Integer.MAX_VALUE;
//         char[] ch1=word1.toCharArray();
//         char[] ch2=word2.toCharArray();
//         if(ch1[i]==ch2[j]){
//             ans=Math.min(ans,rec(i+1,j+1,word1,word2));
//         }else{
//             ans=Math.min(ans,1+rec(i+1,j,word1,word2));
//             ans=Math.min(ans,1+rec(i,j+1,word1,word2));
//             ans=Math.min(ans,1+rec(i+1,j+1,word1,word2));
//         }
//         return ans;


//     }
// }

class Solution {
    int[][] dp;

    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return rec(0, 0, word1, word2);
    }

    public int rec(int i, int j, String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        if (i >= n) return m - j;
        if (j >= m) return n - i;

        if (dp[i][j] != -1) return dp[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] = rec(i + 1, j + 1, word1, word2);
        }

        int delete = 1 + rec(i + 1, j, word1, word2);
        int insert = 1 + rec(i, j + 1, word1, word2);
        int replace = 1 + rec(i + 1, j + 1, word1, word2);

        return dp[i][j] = Math.min(delete, Math.min(insert, replace));
    }
}
