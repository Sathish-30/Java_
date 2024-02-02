import java.util.*;

public class Selection{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Unsorted Array : "+Arrays.toString(arr));
        int pos = 0 , min = 0;
        for(int i = 0 ; i < n ; i++){
            min = arr[i];
            for(int j = i + 1 ; j < n ; j++){
                if(min > arr[j]){
                    min = arr[j];
                    pos = j;
                }
            } 
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));
        in.close();
    }
}