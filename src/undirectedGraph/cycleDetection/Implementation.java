package undirectedGraph.cycleDetection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Implementation {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        for(int i = 0 ; i < V ; i++){
            if(!vis[i]){
                vis[i] = true;
                if(helper(new Node(i , -1) , adj , vis)) return true;
            }
        }
        return false;
    }

    public boolean helper(Node n , ArrayList<ArrayList<Integer>> adj ,boolean[] vis){
        int node = n.getFirst();
        int parent = n.getSecond();
        for(int child : adj.get(node)){
            if(!vis[child]){
                vis[child] = true;
                if(helper(new Node(child , node) , adj , vis)) return true;
            }
            else if(parent != child) return true;
        }
        return false;
    }

    public boolean BFSHelper(Map.Entry<Integer , Integer> m , ArrayList<ArrayList<Integer>> adj , boolean[] vis){
        Queue<Map.Entry<Integer , Integer>> queue = new LinkedList<>();
        queue.add(m);
        while (queue.isEmpty()){
            var k = queue.poll();
            int node = k.getKey();
            int parent = k.getValue();
            for(int e : adj.get(node)){
                if(!vis[e]){
                    vis[e] = true;
                    queue.add(Map.entry(e , node));
                }else if(parent != e){
                    return true;
                }
            }
        }
        return false;
    }
}
class Node{
    int first;
    int second;
    public Node(int first , int second){
        this.first = first;
        this.second = second;
    }
    int getFirst(){
        return this.first;
    }
    int getSecond(){
        return this.second;
    }
}
