package graph.dfs;

import java.util.LinkedList;
import java.util.List;

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

    public boolean findPath(int source , int des , List<Integer> al){
        al.add(source);
        if(source == des) return true;
        for(int neighbour : arr[source]){
            if(findPath(neighbour , des , al)) return true;
        }
        al.removeLast();
        return false;
    }

    public boolean checkCycle(boolean[] vis , int node){
        for(int neighbour : arr[node]){
            if(!vis[neighbour]){
                vis[neighbour] = true;
                if(checkCycle(vis , neighbour)) return true;
            }else return true;
        }
        return false;
    }
}
