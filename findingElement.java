import java.util.Scanner;
public class findingElement{
    public static void main(String[] args) {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter elements of an aray");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt(); 
        }
        
        int x = sc.nextInt();
        System.out.println("Enter element to be find");
        int num = sc.nextInt();

        for(int i=0; i<arr.length; i++ ){
            if(arr[i] == num){
            System.out.println("Element found at index" + i);
            found = true;
            break;
            }
        }

        if(!found){
            System.out.println("Elemet not found");
        }

        sc.close();
    }
}