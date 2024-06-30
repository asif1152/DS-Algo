//package leetcode.dynamicprogramming;
//
//public class Solution_174 {
//    public int calculateMinimumHP(int[][] dungeon) {
//
//        int m = dungeon.length;
//        int n = dungeon[0].length;
//        int healthDp[][] = new int[m][n];
//        healthDp[m-1][n-1] = dungeon[m-1][n-1] >=0 ? 1: 1- dungeon[m-1][n-1];
//        for(int j=n-2;j>=0;--j){
//            int curVal = dungeon[m-1][j];
//            if(curVal>= healthDp[m-1][j+1]){
//                healthDp[m-1][j] = 1;
//            }else {
//                healthDp[m - 1][j] = healthDp[m - 1][j + 1] - curVal;
//            }
//        }
//
//        for(int i= m-2;i>=0;--i){
//            int curVal = dungeon[i][n-1];
//            if(curVal >= healthDp[i+1][n-1]){
//                healthDp[i][n-1] = 1;
//            }else{
//                healthDp[i][n-1] = healthDp[i+1][n-1] - curVal;
//            }
//        }
//
//        for(int i=m-2;i>=0;--i){
//            for(int j=n-2;j>=0;--j){
//                int curVal = dungeon[i][j];
//                int rightVal = healthDp[i][j+1];
//                int dwnVal = healthDp[i+1][j];
//                int rhVal = curVal >= rightVal ? 1: rightVal- curVal;
//                int dhVal = curVal >= dwnVal ? 1: dwnVal - curVal;
//                healthDp[i][j] = Math.min(rhVal, dhVal);
//            }
//        }
//        return healthDp[0][0];
//    }
//}
