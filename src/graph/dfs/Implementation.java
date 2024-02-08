package graph.dfs;

import graph.dfs.Graph;

import java.util.ArrayList;
import java.util.List;

public class Implementation {
    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.insertEdge(1 , 4);
        graph.insertEdge(1 , 2);
        graph.insertEdge(4 , 7);
        graph.insertEdge(2 , 3);
        graph.DFS(1);
        System.out.println();
        List<Integer> al = new ArrayList<>();
        if(graph.findPath(1 , 3 , al)){
            System.out.println("There exists a Path");
            System.out.println(al);
        }
    }
}
