import java.util.*;

public class HW10_Part1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100+1);
        }
        System.out.println("Numbers Generated: " + Arrays.toString(arr));
        insertionSortRecursive(arr,arr.length);
        System.out.println("Numbers Sorted: " + Arrays.toString(arr));
    }
    public static void insertionSortRecursive(int arr[], int n) {
        if (n <= 1) return;
        insertionSortRecursive( arr, n-1 );
        int last = arr[n-1];
        int k = n-2;
        while (k >= 0 && arr[k] > last) {
            arr[k+1] = arr[k];
            k--;
        }
        arr[k+1] = last;
    }
}