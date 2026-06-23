class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] temp=new int[n];
        k=k%n;
        // for(int i=0;i<n-k;i++){
        //     temp[k+i]=nums[i];
        // }
        // for(int i=n-k;i<n;i++){
        //     temp[i-(n-k)]=nums[i];
        // }

       
        // for(int i=0;i<n;i++){
        //     temp[(i + k) % n] = nums[i];

        // }
        // for(int i=0;i<n;i++){
        //     nums[i]=temp[i];
        // }

        // using single space

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);


        

        
    }
    private void reverse(int[] nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;

        }
    }
}