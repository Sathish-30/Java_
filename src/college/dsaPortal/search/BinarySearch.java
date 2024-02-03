package college.dsaPortal.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10 , 20 ,30 ,40 , 50};
        int start = 0;
        int end = arr.length - 1;
        int k = 50 , c = 0;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == k){
                c++;
                System.out.println("Element found");
                break;
            }else if(arr[mid] > k){
                end = mid - 1;
                c++;
            }else if(arr[mid] < k){
                start = mid + 1;
                c++;
            }
        }
        System.out.println("The number of circle the search has been divided is : "+c);
    }
}
