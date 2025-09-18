
import java.util.Arrays;
import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of an array");
        int n = input.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter Target Value");
        int target = input.nextInt();


        int ans = linearSearch(arr, target);
        if (ans != -1) {
            System.out.println("Target found at index: " + ans);
        } else {
            System.out.println("Target not found in the array.");
        }

        }
    
        static int linearSearch(int arr[], int target){
            if(arr.length == 0){
                return -1;
            }

            for(int i=0; i<arr.length; i++){
                if(arr[i] == target){
                    return i;
                }
            }

            return -1;
        }
    }
    