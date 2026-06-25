class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int high = 0;
for(int x : piles){
    high = Math.max(high, x);
}
        int low=1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(ischecked(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean ischecked(int[] piles,int k,int h){
        int count=0;
        for(int i=0;i<piles.length;i++){
           count += Math.ceil((double)piles[i] / k);

        }
        return count<=h;
    }
}