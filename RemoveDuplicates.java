public class RemoveDuplicates {
    public static void main(String[] args){
        String str = "abccdeabc";
        String result = "";
        for(int i=0; i<str.length(); i++){
            boolean isDuplicate = false;
            for(int j=0;  j<i; j++){
                if( str.charAt(i) == str.charAt(j)){
                    isDuplicate = true;
                    break;   
                }
            }
            if(!isDuplicate){
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
    
}
