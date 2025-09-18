public class MinBySearching {
    public static void main(String[] args) {
    
    int[] arr = {18, 5, 8, 6, 22, 17};
    int ans = min(arr);
    System.out.println(ans);
}

static int min(int[] arr){
    int ans = arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i] < ans){
            ans = arr[i];
        }
    }
    return ans;
}
}

