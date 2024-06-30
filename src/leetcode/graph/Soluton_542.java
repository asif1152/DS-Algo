//package leetcode.graph;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Soluton_542 {
//
//    public int[][] updateMatrix(int[][] mat) {
//
//        int r = mat.length;
//        int c = mat[0].length;
//
//        boolean[][] vis = new boolean[r][c];
//
//        Queue<int[]> q = new LinkedList<>();
//
//        for(int i=0;i<r;++i){
//            for(int j=0;j<c;++j){
//                if(mat[i][j]==0){
//                    q.add(new int[]{i, j, 0});
//                    vis[i][j] = true;
//                }
//            }
//        }
//
//        int[] xdr = new int[]{0, 1, 0 , -1, 0};
//
//        while (!q.isEmpty()){
//
//            int[] ele = q.poll();
//            int x= ele[0];
//            int y = ele[1];
//            int dist = ele[2];
//
//            for(int i=0;i<4;++i){
//                int j = i+1;
//
//                int newx = x + xdr[i];
//                int newy = y+ xdr[j];
//                if(newx >=0 && newx <r && newy >= 0 && newy < c && !vis[newx][newy]){
//                    mat[newx][newy] = dist+1;
//                    vis[newx][newy] = true;
//                    q.add(new int[]{newx, newy, dist+1});
//                }
//            }
//        }
//        return mat;
//    }
//
//
//
//
//}
