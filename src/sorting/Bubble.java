import java.util.*;

public class Bubble{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        int i = 0 , j = 0 , len = arr.length;
        System.out.println("Unsorted Array : "+ Arrays.toString(arr));
        while(i < len - 1){
            j = 0 ;
            boolean flag = false;
            while(j < len - i - 1){
                if(arr[j] > arr[j + 1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                j++;
            }
            if(!flag) break;
            i++;
        }
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
}