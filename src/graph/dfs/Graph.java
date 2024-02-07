package graph.dfs;

import java.util.LinkedList;

public class Graph {
    private int V;
    private LinkedList<Integer>[] arr ;
    public Graph(int vertex){
        V = vertex;
        arr = new LinkedList[V];
        for(int i = 0 ; i < V ; i++){
            arr[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int sourceVertex , int destinationVertex){
        arr[sourceVertex].add(destinationVertex);
    }

    public void DFS(int start){
        System.out.print("Traversal : ");
        boolean[] vis = new boolean[V];
        dfsHelper(start , vis);
        System.out.print("null");
    }

    private void dfsHelper(int start, boolean[] vis) {
        vis[start] = true;
        System.out.print(start+"->");
        for(int e : arr[start]){
            if(!vis[e]){
                dfsHelper(e , vis);
            }
        }
    }

}
