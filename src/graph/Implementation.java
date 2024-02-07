package graph;

public class Implementation {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.insertEdge(0 , 1);
        graph.insertEdge(0 , 2);
        graph.insertEdge(1 , 3);
        graph.insertEdge(1 , 4);
        graph.insertEdge(2 , 5);
        graph.insertEdge(2 , 6);
        graph.DFS(0);
    }
}
