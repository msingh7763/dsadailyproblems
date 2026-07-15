// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int ans=0;
//         for(int i=0;i<nums.length;i++){
//             ans=Math.max(ans,1+rec(i,i+1,nums));
//         }
//         return ans;

//     }
//     public int rec(int i,int j,int[] nums){
//         if(j>=nums.length){
//             return 0;
//         }
//         int ans=0;
//         if(nums[i]<nums[j]){
//             ans=Math.max(ans,1+rec(j,j+1,nums));
//         }
//         ans=Math.max(ans,rec(i,j+1,nums));
//         return ans;

        
//     }
// }


class Solution {
    int[][] dp;

    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length][nums.length + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, 1 + rec(i, i + 1, nums));
        }
        return ans;
    }

    public int rec(int i, int j, int[] nums) {
        if (j >= nums.length) {
            return 0;
        }

        if (dp[i][j] != -1) return dp[i][j]; 

        int ans = 0;
        if (nums[i] < nums[j]) {
            ans = Math.max(ans, 1 + rec(j, j + 1, nums));
        }
        ans = Math.max(ans, rec(i, j + 1, nums));

        return dp[i][j] = ans;               
    }
}