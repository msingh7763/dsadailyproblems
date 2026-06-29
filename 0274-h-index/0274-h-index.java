class Solution {
    public int hIndex(int[] citations) {
        // int n=citations.length;
        // if(n==1 && citations[0]<=1){
        //     return citations[0];
        // }else if(n==1 && citations[0]>1){
        //     return 1;
        // }
        // for(int i=0,j=n-1;i<j;i++,j--){
        //     int temp=citations[i];
        //     citations[i]=citations[j];
        //     citations[j]=temp;
        // }
        // int re=-1;
        // for(int i=0;i<n;i++){
        //     if(citations[i]<i+1){
        //         re=i;
        //     }
        // }
        
        int i,n=citations.length,ans=0;
        Arrays.sort(citations);
        for(i=n-1; i>=0; i--) ans= Math.max(ans, Math.min(n-i, citations[i]));
        return ans;
    }
}