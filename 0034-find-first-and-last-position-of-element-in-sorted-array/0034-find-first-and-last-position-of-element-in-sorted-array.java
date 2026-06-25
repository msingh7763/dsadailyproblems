class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] re={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(re[0]==-1){
                    re[0]=i;
                    
                }
                re[1]=i;
            }

        }
        return re;
    }
}