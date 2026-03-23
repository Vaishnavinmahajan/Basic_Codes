import java.util.*;

public class LeftRotatingArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,7,9,6};
        int temp = arr[0];
            for(int i=1 ; i<arr.length; i++){
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = temp;
            System.out.println("Rotated array is: " + Arrays.toString(arr));
    }   
}
