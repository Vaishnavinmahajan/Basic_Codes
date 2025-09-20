
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter Target Value: ");
        int target = input.nextInt();

        int ans = binarySearch(arr, target);
            if (ans != -1) {
                System.out.println("Target found at index: " + ans);
            } else {
                System.out.println("Target not found in the array.");
            }

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
