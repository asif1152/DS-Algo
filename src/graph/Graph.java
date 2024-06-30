package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

    private int V;
    private List<Integer>[] adj;


    public Graph(int v) {
        V = v;
        adj = new LinkedList[V];
        for(int i=0;i<V;++i){
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int u, int v){
        this.adj[u-1].add(v-1);
        this.adj[v-1].add(u-1); // this is for undirected graph
    }

    public void bfs(int s){

        boolean vis[] = new boolean[this.V];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        vis[s] = true;
        while(!queue.isEmpty()){
            int u = queue.poll();
            System.out.printf("%d ->",u);
            for(int v: adj[u]){
                if(!vis[v]){
                    vis[v] = true;
                    queue.add(v);
                }
            }
        }
    }
}
