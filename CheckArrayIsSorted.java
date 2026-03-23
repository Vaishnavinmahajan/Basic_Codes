import java.util.*;

public class CheckArrayIsSorted {
    static boolean IsSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,9,22,56,99};
        if(IsSorted(arr)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
    

