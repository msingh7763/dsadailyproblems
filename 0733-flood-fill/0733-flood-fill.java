// class Solution {
//     static int rows;
//     static int cols;
//     public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//         rows=image.length;
//         cols=image[0].length;
//         dfs(sr,sc,image,color,image[sr][sc]);
//         return image;
        
//     }
//     private static void dfs(int row,int col,int[][] image,int color,int newc){
//         if(row<0 || col<0 || row>=rows || col>=cols){
//             return;
//         }
//         if(image[row][col]!=color || image[row][col]==newc){
//             return;
//         }
//         image[row][col]=newc;
//             int[][] adj = {
//                 {row-1, col},
//                 {row, col+1},
//                 {row+1, col},
//                 {row, col-1}
//             };

//         for(int[]m:adj){
//             dfs(m[0],m[1],image,newc,color);
//         }

//     }
// }

class Solution {
    static int rows;
    static int cols;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows = image.length;
        cols = image[0].length;

        int oldColor = image[sr][sc];

        if (oldColor == color) return image;

        dfs(sr, sc, image, oldColor, color);

        return image;
    }

    private static void dfs(int row, int col, int[][] image, int oldColor, int newColor) {

        if (row < 0 || col < 0 || row >= rows || col >= cols)
            return;

        if (image[row][col] != oldColor)
            return;

        image[row][col] = newColor;

        dfs(row - 1, col, image, oldColor, newColor);
        dfs(row + 1, col, image, oldColor, newColor);
        dfs(row, col - 1, image, oldColor, newColor);
        dfs(row, col + 1, image, oldColor, newColor);
    }
}