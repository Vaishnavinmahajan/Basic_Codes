public class EvenDigitBySearching {
    public static void main(String[] args) {
        int[] arr ={12, 345, 2, 6, 7896};
        System.out.println(findNumber(arr));
    }
    
    static int findNumber(int[] arr){
        int count = 0;
        for(int num=0; num<arr.length; num++){
            if(even(arr[num])){
                count ++;
            }
        }
        return count;
    }
    
    // function for determins the digits are even or odd
    static boolean even(int num ){
        int numberofDigits = digits(num);
        if(numberofDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count = 0;

        while(num > 0){
            count ++;
            num = num / 10;
        }
        return count;
    }
}
    

