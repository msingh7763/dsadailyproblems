class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int ans=0;
        return Math.max(
        rec(0,n-2,nums),
        rec(1,n-1,nums));
        
    }
    public int rec(int start, int end,int[] nums){
        int temp1=0;
        int temp2=0;
        int ans=0;
        for(int i=start;i<=end;i++){
            ans=Math.max(temp1,temp2+nums[i]);
            temp2=temp1;
            temp1=ans;
        }
        return temp1;
    }
}