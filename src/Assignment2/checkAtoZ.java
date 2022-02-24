package Assignment2;
import  java.util.*;
public class checkAtoZ {
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     System.out.println("Give the Input String");
     String str= s.nextLine();
     System.out.println(checkAlpha(str));
    }
    public static boolean checkAlpha(String str){
        int index=0;
        boolean arr[]=new boolean [26];

        for(int i=0;i<str.length();i++){
            if('a'<=str.charAt(i)&&'z'>=str.charAt(i)){
                index=str.charAt(i)-'a';

            }
            arr[index]=true;

        }
        for (int i=0;i<26;i++){
            if(arr[i]==false){
                return false;
            }
        }
        return true;
    }
}
