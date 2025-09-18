import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter" + n + "elements");
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println("Reversed Array :" );
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " " );
        }

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr,  start, end);
            start ++;
            end --;

        }

        
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}