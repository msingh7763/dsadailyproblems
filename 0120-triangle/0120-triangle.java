class Solution {
    Integer[][]dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        dp=new Integer[triangle.size()][triangle.size()];
        // for(int[] n:dp){
        //     Arrays.fill(n,-1);
        // }
        return rec(0,0,triangle);
        
    }
    public int rec(int i,int j,List<List<Integer>>tri){
        if(i==tri.size()){
            return 0;
        }
        if (dp[i][j] != null) return dp[i][j];

        int down=rec(i+1,j,tri);
        int dig=rec(i+1,j+1,tri);
        
        dp[i][j]=tri.get(i).get(j)+Math.min(down,dig);
        return dp[i][j];
    }
}

