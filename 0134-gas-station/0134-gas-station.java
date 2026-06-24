class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        for(int x:gas){
            totalgas+=x;
        }
        for(int x:cost){
            totalcost+=x;
        }
        if(totalgas<totalcost){
            return -1;
        }
        int start=0;
        int re=0;
        for(int i=0;i<gas.length;i++){
            re+=gas[i]-cost[i];
            if(re<0){
                start=i+1;
                re=0;
            }

        }
        return start;
    }
}