package sorting.merge;
import java.util.Arrays;
import java.util.Scanner;


public class Implementation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0  ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        merge(arr , 0 , arr.length - 1);
    }
    public static void merge(int[] arr , int low , int high){
        if(low == high) return;
        int mid = (low + high) / 2;
        merge(arr , low , mid);
        merge(arr , mid + 1 , high);
        sort(arr , low , mid , high);
        System.out.println(Arrays.toString(arr));
        System.out.println();

    }
    public static void sort(int[] arr , int low , int mid , int high){
        int[] temp = new int[(high - low) + 1];
        int i = low , j = mid + 1 , k = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= high){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int x = low ; x <= high ; x++){
            arr[x] = temp[x - low];
        }
        System.out.println(Arrays.toString(temp));
    }
}
