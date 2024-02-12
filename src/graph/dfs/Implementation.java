package graph.dfs;

import graph.dfs.Graph;

import java.util.ArrayList;
import java.util.List;

public class Implementation {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.insertEdge(0 , 1);
        graph.insertEdge(1 , 2);
        graph.insertEdge(2 , 5);
        graph.insertEdge(5 , 3);
        graph.DFS(0);
        System.out.println();
        boolean[] vis = new boolean[6];
        vis[0] = true;
        if(graph.checkCycle(vis , 0)){
            System.out.println("Cycle detected");
        }else{
            System.out.println("No Cycle detected");
        }
        System.out.println();

    }
}
