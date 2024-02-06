package sorting.quick;

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
        quick(arr , 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr , int low , int high){
        if(low < high) {
            int pivot = sort(arr, low, high);
            quick(arr, low, pivot - 1);
            quick(arr, pivot + 1, high);
        }
    }
    static int sort(int[] arr , int low , int high){
        int pivot = arr[low];
        int i = low , j = high;
        while(i < j){
            while(arr[i] <= pivot && i <= high - 1){
                i++;
            }
            while(arr[j] > pivot && j >= low + 1){
                j--;
            }
            if(i < j){
                swap(arr , i , j);
            }
        }
        swap(arr , j , low);
        return j;
    }
    static void swap(int[] arr , int i ,  int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
