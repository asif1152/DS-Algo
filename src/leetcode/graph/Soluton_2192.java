//package leetcode.graph;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Soluton_2192 {
//
//    class Graph{
//
//        int V;
//        List<Integer> adj[];
//
//        public Graph(int n){
//            this.V = n;
//            this.adj = new LinkedList[V];
//            for(int i=0;i<V;++i)
//                adj[i] = new LinkedList<>();
//        }
//
//        public void addEdge(int u, int v){
//            this.adj[u].add(v);
//        }
//    }
//
//    public List<List<Integer>> getAncestors(int n, int[][] edges) {
//
//        Graph g = new Graph(n);
//        for(int[] edge: edges){
//            // reversing the edge
//            g.addEdge(edge[1], edge[0]);
//        }
//        HashMap<Integer, HashSet<Integer>> ancestorMap = new HashMap<>();
//        for(int i=0;i<n;++i){
//            if(ancestorMap.containsKey(i))
//                continue;
//            Queue<Integer> q = new LinkedList<>();
//            q.add(i);
//            HashSet<Integer> tmpAnc = new HashSet<>();
//            boolean[] vis = new boolean[g.V];
//            vis[i] = true;
//            while(!q.isEmpty()){
//                int u = q.poll();
//                for(int v: g.adj[u]){
//                    if(vis[v])
//                        continue;
//                    if(ancestorMap.containsKey(v)){
//                        tmpAnc.addAll(ancestorMap.get(v));
//                    }else{
//                        q.add(v);
//                    }
//                    tmpAnc.add(v);
//                    vis[v] = true;
//                }
//            }
//            ancestorMap.put(i, tmpAnc);
//        }
//        List<List<Integer>> allAncestors = new LinkedList<>();
//        for(int i=0;i<n;++i){
//            HashSet<Integer> tmpAnc = ancestorMap.get(i);
//            List<Integer> tmpAncList = tmpAnc.stream().sorted().toList();
//            allAncestors.add(tmpAncList);
//        }
//        return allAncestors;
//    }
//}
