//package leetcode.graph;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.PriorityQueue;
//
//public class Solution_743 {
//
//    class Edge{
//        int v, w;
//        public Edge(int v, int w){
//            this.v = v;
//            this.w = w;
//        }
//    }
//
//    class graph {
//
//        List<Edge>[] adj;
//        int V;
//        public graph(int v){
//            this.V = v;
//            this.adj = new LinkedList[v+1];
//            for(int i=0;i<=v;++i)
//                adj[i] = new LinkedList<>();
//        }
//        public void addEdge(int u, int v, int w){
//            adj[u].add(new Edge(v, w));
//        }
//
//        public int[] dijkstra(int k){
//
//            int[] dist = new int[V+1];
//            Arrays.fill(dist, Integer.MAX_VALUE);
//            dist[k] =0;
//            PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
//            pq.add(new int[]{0, k});
//            boolean[] vis = new boolean[this.V+1];
//            while(!pq.isEmpty()){
//                int[] ele= pq.poll();
//                int w = ele[0];
//                int u = ele[1];
//                vis[u] = true;
//                for(Edge ed: adj[u]){
//                    int v = ed.v;
//                    if(vis[v])
//                        continue;
//                    if(ed.w + w < dist[v]){
//                        dist[v] = ed.w + w;
//                        pq.add(new int[]{dist[v], v});
//                    }
//                }
//            }
//            return dist;
//        }
//
//
//    }
//
//    public int networkDelayTime(int[][] times, int n, int k) {
//
//        graph g = new graph(n);
//        for(int[] edge: times){
//            g.addEdge(edge[0], edge[1], edge[2]);
//        }
//        int[] dist = g.dijkstra(k);
//        int nwDlTm = Integer.MIN_VALUE;
//        for(int i=1;i<=g.V;++i){
//            int tmpDist = dist[i];
//            if(tmpDist == Integer.MAX_VALUE)
//                return -1;
//            nwDlTm = Math.max(nwDlTm, tmpDist);
//        }
//        return nwDlTm;
//    }
//
//}
