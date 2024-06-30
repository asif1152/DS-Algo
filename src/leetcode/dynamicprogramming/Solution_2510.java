//package leetcode.dynamicprogramming;
//
//public class Solution_2510 {
//
//    public boolean isThereAPath(int[][] grid) {
//        int m = grid.length;
//        int n = grid[0].length;
//        int dp[][][] = new int[m][n][2];
//        if(grid[0][0]== 0){
//            dp[0][0][0] = 1;
//            dp[0][0][1] = 0;
//        }
//        for(int j=1;j<n;++j){
//            dp[0][j][0] = dp[0][j-1][0];
//            dp[0][j][1] = dp[0][j-1][1];
//            if(grid[0][j]==0){
//                dp[0][j][0] += 1;
//            }else{
//                dp[0][j][1] += 1;
//            }
//        }
//        for(int i=1;i<m;++i){
//            dp[i][0][0] = dp[i-1][0][0];
//            dp[i][0][1] = dp[i-1][0][1];
//            if(grid[i][0]==0){
//                dp[i][0][0] += 1;
//            }else{
//                dp[i][0][1] += 1;
//            }
//        }
//
//        for(int i=1;i<m;++i){
//            for(int j=1;j<n;++j){
//                dp[i][j][0] = dp[i][j-1]
//            }
//        }
//
//
//
//
//    }
//}
