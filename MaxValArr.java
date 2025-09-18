import java.util.Arrays;
import java.util.Scanner;

public class MaxValArr {
public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter" + n + "elements:");
        for(int i=0; i<n; i++){
            arr[i]= input.nextInt();
        }

        int maxValue = max(arr);
        System.out.println("Maximum value = " + maxValue);
}
        
   static int max(int[] arr){
    int maxVal = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i] > maxVal){
            maxVal = arr[i];
        }
    }
    return maxVal;
   }
}
