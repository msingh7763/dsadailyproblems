class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long count=0;int n=nums.length;
        long total = (long)n * (n - 1) / 2;
        for(int i=0;i<nums.length;i++){
            int diff=nums[i]-i;
            count+=map.getOrDefault(diff,0);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        return total-count;
        
    }
}