class Solution {
    public int maxSubArray(int[] nums) {
        int csum=nums[0];
        int maxs=nums[0];
        for(int i=1;i<nums.length;i++){
            csum=Math.max(nums[i],csum+nums[i]);
            maxs=Math.max(maxs,csum);

        }
        return maxs;
        
    }
}