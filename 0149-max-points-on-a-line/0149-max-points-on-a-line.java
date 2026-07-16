// class Solution {
//     public int maxPoints(int[][] points) {
//         int[] slope=new int[points.length];
//             Arrays.fill(slope,-1);
        

//         for(int i=0;i<points.length;i++){
//             for(int j=i+1;j<points.length;j++){
//                 int dx = points[j][0] - points[i][0];
//                 int dy = points[j][1] - points[i][1];
//                 slope[i]=dy/dx;


//             }
//         }
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int x:slope){
//             map.put(x,map.getOrDefault(x,0)+1);
//         }
//         int maxFreq = 0;

//         for (int freq : map.values()) {
//             maxFreq = Math.max(maxFreq, freq);
//         }
//         return maxFreq+1;



        
//     }
// }

import java.util.*;

class Solution {

    public int maxPoints(int[][] points) {

        int n = points.length;
        if (n <= 2) return n;

        int ans = 2;

        for (int i = 0; i < n; i++) {

            HashMap<String, Integer> map = new HashMap<>();
            int max = 0;
            for (int j = i + 1; j < n; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                int g = gcd(dx, dy);
                dx /= g;
                dy /= g;

                // Keep a unique representation
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }

                if (dx == 0) {
                    dy = 1;          // vertical line
                }
                if (dy == 0) {
                    dx = 1;          // horizontal line
                }
                String slope = dy + "/" + dx;
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                max = Math.max(max, map.get(slope));
            }
            ans = Math.max(ans, max + 1);
        }
        return ans;
    }
    int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }
}