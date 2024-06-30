//package leetcode.graph;
//
//import java.util.*;
//
//public class Soluton_802 {
//
//    class Graph{
//        int V;
//        HashSet<Integer> adj[];
//        int outDeg[];
//        List<Integer> inDeg[];
//
//        public Graph(int V){
//            this.V = V;
//            this.adj = new HashSet[this.V];
//            for(int i=0;i<V;++i)
//                adj[i] = new HashSet<>();
//            this.outDeg = new int[this.V];
//            this.inDeg = new LinkedList[this.V];
//            for(int i=0;i<V;++i)
//                this.inDeg[i] = new LinkedList<>();
//        }
//
//        public void addEdge(int u, int v){
//            this.adj[u].add(v);
//            this.outDeg[u] += 1;
//            this.inDeg[v].add(u);
//        }
//
//        public List<Integer> findSafeNodes(){
//            List<Integer> safeNodes = new ArrayList<>();
//            boolean[] vis = new boolean[this.V];
//            boolean find;
//            do{
//                find = false;
//                for(int i=0;i<V;++i){
//                    if(this.outDeg[i]==0 && !vis[i]){
//                        vis[i] = true;
//                        find = true;
//                        safeNodes.add(i);
//                        for(int j: this.inDeg[i]){
//                            this.outDeg[j] -=1;
//                        }
//                    }
//                }
//            }while (find);
//
////            boolean find;
////            do{
////                find = false;
////                for(int i=0;i<V;++i){
////                    if(adj[i].size() ==0 && !vis[i]){
////                        vis[i] = true;
////                        safeNodes.add(i);
////                        find=true;
////                        // remove in degree connections for this node to find next terminal node
////                        for(int j=0;j<V;++j){
////                            if(adj[j].contains(i))
////                                adj[j].remove(Integer.valueOf(i));
////                        }
////                    }
////                }
////            }while(find);
//            Collections.sort(safeNodes);
//            return safeNodes;
//        }
//    }
//
//    public List<Integer> eventualSafeNodes(int[][] graph) {
//
//        int n = graph.length;
//        Graph g = new Graph(n);
//        for(int i=0;i<n;++i){
//            for(int j=0;j<graph[i].length;++j){
//                int v = graph[i][j];
//                g.addEdge(i, v);
//            }
//        }
//        return g.findSafeNodes();
//    }
//}
