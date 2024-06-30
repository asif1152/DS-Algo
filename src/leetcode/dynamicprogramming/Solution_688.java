//package leetcode.dynamicprogramming;
//
//public class Solution_688 {
//
//    boolean isValid(int x, int y, int n){
//        return x >= 0 && x < n && y >= 0 && y < n;
//    }
//    public double knightProbability(int n, int k, int row, int column) {
//
//
//        // [-2, -1], [-2, 1], [-1, -2], [-1, 2], [2, -1], [2, 1], [1, -2], [1, 2]
//
//        int[] idxI = new int[]{-2, -2, -1, -1, 2, 2, 1, 1};
//        int[] idxJ = new int[]{-1, 1, -2, 2, -1, 1, -2, 2};
//
//        double[][][] prob = new double[n][n][k+1];
//        double probConst = 1.0/8.0;
//        for(int p=0;p<=k;++p){
//            for(int i=0;i<n;++i){
//                for(int j=0;j<n;++j){
//                    if(p==0)
//                        prob[i][j][p] = 1.0;
//                    else{
//                        for(int idx=0;idx<8;++idx){
//                            int x = i + idxI[idx];
//                            int y = j + idxJ[idx];
//                            if(isValid(x, y, n)){
//                                prob[i][j][p] += (probConst*prob[x][y][p-1]);
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return prob[row][column][k];
//    }
//}
