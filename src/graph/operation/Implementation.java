package graph.operation;

import java.util.Arrays;
import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {
        int[][] graph1 = getArray(3);
        int[][] graph2 = getArray(3);
        unionOfGraph(graph1 , graph2);
    }

    private static int[][] getArray(int ind) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[ind][ind];
        for(int i = 0 ; i < ind ; i++){
            for(int j = 0 ; j < ind ; j++){
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }

    public static void unionOfGraph(int[][] G1 , int[][] G2){
        int node = G1.length;
        int edge = G1[0].length;
        int[][] res = new int[node][edge];
        for(int i = 0 ; i < node ; i++){
            for(int j = 0 ; j < edge ; j++){
                if(G1[i][j] == 1 || G2[i][j] == 1) res[i][j] = 1;
            }
        }
        for(int[] e  : res){
            System.out.println(Arrays.toString(e));
        }
    }

    public static void intersectionOfGraph(int[][] G1 , int[][] G2){
        var node = G1.length;
        int edge = G1[0].length;
        int[][] res = new int[node][edge];
        for(int i = 0 ; i < node ; i++){
            for(int j = 0 ; j < edge ; j++){
                if(G1[i][j] == 1 && G2[i][j] == 1) res[i][j] = 1;
            }
        }
    }
}
