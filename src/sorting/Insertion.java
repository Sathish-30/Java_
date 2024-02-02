import java.util.*;

public class Insertion{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Unsorted Array : "+Arrays.toString(arr));
        for(int i = 1 ; i < n ; i++){
            int j = i - 1;
            int ele = arr[i];
            while(j >= 0 && ele < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            j += 1;
            arr[j] = ele;
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));
        in.close();
    }
}