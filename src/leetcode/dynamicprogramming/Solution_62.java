//package leetcode.dynamicprogramming;
//
//public class Solution_62 {
//    public int uniquePaths(int m, int n) {
//
//        int ways[][] = new int[m][n];
//        ways[0][0] =1 ;
//        for(int j=1;j<n;++j){
//            ways[0][j] += ways[0][j-1];
//        }
//        for(int i=1;i<m;++i){
//            ways[i][0] += ways[i-1][0];
//        }
//        for(int i=1;i<m;++i){
//            for(int j=1;j<n;++j){
//                ways[i][j] += ways[i-1][j] + ways[i][j-1];
//            }
//        }
//        return ways[m-1][n-1];
//    }
//}
