//package leetcode.graph;
//
//public class Solution684 {
//
//    public int[] findRedundantConnection(int[][] edges) {
//
//        int n = edges.length;
//        DSU ds = new DSU(n);
//
//        int[] ans = new int[2];
//
//        for (int[] edge : edges) {
//            int u = edge[0];
//            int v = edge[1];
//            if (!ds.union(u, v)) {
//                ans[0] = u;
//                ans[1] = v;
//            }
//        }
//        return ans;
//    }
//
//    static class DSU {
//
//        int[] parent;
//        int[] rank;
//
//        public DSU(int n){
//            parent = new int[n+1];
//            rank = new int[n+1];
//            for(int i=1;i<=n;++i){
//                parent[i] = i;
//            }
//        }
//
//        int findParent(int x){
//            if(parent[x] == x){
//                return x;
//            }
//            parent[x] = findParent(parent[x]);
//            return parent[x];
//        }
//
//        boolean union(int x, int y){
//
//            int parentX = findParent(x);
//            int parentY = findParent(y);
//
//            if(parentX == parentY){
//                return false;
//            }
//
//            if(rank[parentX] < rank[parentY]){
//                parent[parentX] = parentY;
//            }else if(rank[parentX] > rank[parentY]){
//                parent[parentY] = parentX;
//            }else{
//                parent[parentY] = parentX;
//                rank[parentX] += 1;
//            }
//            return true;
//        }
//    }
//}
