class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // HashSet<Integer>set1=new HashSet<>();
        // HashSet<Integer>set2=new HashSet<>();
        // for(int x:nums1){
        //     set1.add(x);
        // }
        // for(int x:nums2){
        //     set2.add(x);
        // }
        // set1.retainAll(set2);
        // int min=Integer.MAX_VALUE;
        // for(int x:set1){
        //     min=Math.min(min,x);

        // }
        // return min;

        int min=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                return nums1[left];
            }
            else if (nums1[left] < nums2[right]) {
                left++;
            } 
            else {
                right++;
            }
            
    
        }
        return -1;
    }
}