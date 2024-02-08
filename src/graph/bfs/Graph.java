package graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

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

    public void BFS(int start){
        System.out.print("Traversal : ");
        boolean[] vis = new boolean[V];
        bfsHelper(start , vis);
        System.out.print("null");
    }

    private void bfsHelper(int start, boolean[] vis) {
        vis[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.print(vertex+" -> ");
            for(int e : arr[vertex]){
                if(!vis[e]) {
                    vis[e] = true;
                    queue.add(e);
                }
            }
        }
    }


}
