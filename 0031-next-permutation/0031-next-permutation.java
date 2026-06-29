class Solution {
    public int[] reverse(int[] arr,int start){
            int i = start;
            int j = arr.length-1;

            while(i<j){
                int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                i++;
                j--;
            }

          return arr;  
    }


    public void nextPermutation(int[] nums) {
        // find pivot 
        int piv =-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piv = i;
                break;
            }
        }

        // if pivot nhi mila 
        if(piv==-1){
           reverse(nums,0);
           return ;
        }
         
        // pivot se next greater element 
        for(int i =nums.length-1;i>piv;i--){
            if(nums[i]>nums[piv]){
                int temp = nums[i];
               nums[i] = nums[piv];
               nums[piv] = temp;
                break; 
            }
        }
      
      // reverse remaining array from right side                                                    
      reverse(nums,piv+1);


    }
}
