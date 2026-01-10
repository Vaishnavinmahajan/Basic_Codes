public class Movex {
    public static void main(String[] args){
        String str = "axbcdxxefx";
        String result = "";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'x'){
                count++;
            }
            else{
            result =  result + str.charAt(i);
            }
        }

        for(int i=0; i<count; i++){
            result = result + 'x';
        }
        System.out.println(result);
    }  
}


