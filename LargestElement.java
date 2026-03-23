import java.util.*;
public class LargestElement{
    public static void main(String[] args) {
        int[] arr = {1,5,4,8,55,99,43,7,94,47,75,22};

//     int max = arr[0];
//     for(int i=0; i<arr.length; i++){
//         if(arr[i] > max){
//             max = arr[i];
//         }
//     }
//     System.out.println("Largest element is: " + max);
// 


//USING SORTING
        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        System.out.println("Largest element is: " + max);
    }
}
   















