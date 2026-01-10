public class Backtracking {
    public static void main(String[] args){
        String str = "abc";
        printPermutation(str, "", 0);
        
    }

    public static void printPermutation(String str, String perm, int idx){
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newstr, perm+currChar, idx+1);
        }

        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
    }
    
}
