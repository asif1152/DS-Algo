//package leetcode.dynamicprogramming;
//
//public class Solution_1155{
//
//    final int MOD = (int)(1e9 + 7);
//    public int numRollsToTarget(int n, int k, int target) {
//
//        int ways[][] = new int[n+1][target+1];
//        ways[0][0] = 1;
//        for(int i=1;i<=n;++i){
//            for(int j=1;j<=target;++j){
//                for(int v=1;v<=k;++v){
//                    if(v>j) break;
//                    ways[i][j] += (ways[i-1][j-v]%MOD);
//                    ways[i][j]%=MOD;
//                }
//            }
//        }
//        return ways[n][target];
//    }
//
//
//}
