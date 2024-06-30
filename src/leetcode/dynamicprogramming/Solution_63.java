//package leetcode.dynamicprogramming;
//
//public class Solution_63 {
//
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//
//        int m = obstacleGrid.length;
//        int n = obstacleGrid[0].length;
//        int[][] ways = new int[m][n];
//        if(obstacleGrid[0][0]==0){
//            ways[0][0] = 1;
//        }else{
//            ways[0][0] =0;
//            return 0;
//        }
//        for(int j=1;j<n;++j){
//            if(obstacleGrid[0][j]==1)
//            {
//                ways[0][j]=0;
//            }else{
//                ways[0][j] = ways[0][j-1];
//            }
//        }