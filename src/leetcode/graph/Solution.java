//package leetcode.graph;
//
//import java.util.*;
//
//public class Solution {
//
//    class Edge {
//
//        int u, v;
//        double w;
//
//        Edge(int u, int v ,double w){
//            this.u = u;
//            this.v = v;
//            this.w = w;
//        }
//    }
//    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
//
//        HashMap<Integer, String> vertMap = new HashMap<>();
//        HashMap<String, Integer> vertRevMap = new HashMap<>();
//        int count =0;
//        int idx =0;
//        List<Edge> edgeList= new LinkedList<>();
//        for(List<String> eqn: equations){
//
//            double val = values[idx++];
//            String a = eqn.get(0);
//            String b= eqn.get(1);
//            int u, v;
//            if(!vertRevMap.containsKey(a)){
//                vertRevMap.put(a, count);
//                vertMap.put(count, a);
//                ++count;
//            }
//            u = vertRevMap.get(a);
//            if(!vertRevMap.containsKey(b)){
//                vertRevMap.put(b, count);
//                vertMap.put(count, b);
//                ++count;
//            }
//            v = vertRevMap.get(b);
//
//            edgeList.add(new Edge(u, v, val));
//            edgeList.add(new Edge(v, u,  1/val));
//        }
//
//        Graph g = new Graph(count);
//        for(Edge edge: edgeList){
//            g.addEdge(edge.u, edge.v, edge.w);
//        }
//        double[] ans = new double[queries.size()];
//        idx =0;
//        for(List<String> query: queries){
//            String a = query.get(0);
//            String b = query.get(1);
//            if(!vertRevMap.containsKey(a) || !vertRevMap.containsKey(b)){
//                ans[idx++] = -1.0;
//                continue;
//            }
//
//            int u = vertRevMap.get(a);
//            int v = vertRevMap.get(b);
//            //ans[idx++] = g.findPath(u, v);
//            boolean vis[] = new boolean[g.V];
//            ans[idx++] = g.findPathDfs(u, v, 1, vis);
//        }
//        return ans;
//    }
//
//    static class Pair{
//        int v;
//        double w;
//        public Pair(int v, double w){
//            this.v = v;
//            this.w = w;
//        }
//    }
//
//    class Graph {
//        int V;
//        List<Pair>[] adj;
//
//        public Graph(int V){
//            this.V = V;
//            adj = new LinkedList[V];
//            for(int i=0;i<V;++i){
//                adj[i] = new LinkedList<>();
//            }
//        }
//
//        // Directed graph
//        public void addEdge(int u,int v, double w){
//            this.adj[u].add(new Pair(v, w));
//        }
//
//        public double findPath(int src, int dest){
//
//            boolean[] vis = new boolean[this.V];
//
//            Queue<Pair> q= new LinkedList<>();
//            q.add(new Pair(src, 1));
//            vis[src] = true;
//
//            while(!q.isEmpty()){
//                Pair tmp = q.poll();
//                int u = tmp.v;
//                if(u == dest){
//                    return tmp.w;
//                }
//                for(Pair p: adj[u]){
//                    int v = p.v;
//                    double w = p.w;
//                    if(!vis[v]){
//                        vis[v] = true;
//                        q.add(new Pair(v, w*tmp.w));
//                    }
//                }
//            }
//            return -1.0;
//        }
//
//        public double findPathDfs(int src, int dest, double wt,  boolean[] vis){
//
//            if(src == dest){
//                return wt;
//            }
//
//            vis[src] = true;
//
//            for(Pair p: adj[src]){
//                int v = p.v;
//                double w = p.w;
//                if(!vis[v]){
//                    double ans = findPathDfs(v, dest, wt*w, vis);
//                    if(ans!=-1.0){
//                        return ans;
//                    }
//                }
//            }
//
//            return -1.0;
//        }
//
//    }
//}
