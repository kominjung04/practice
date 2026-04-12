import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0 ; i < a.length();i++){
            char c = a.charAt(i);
        if(a.charAt(i) >= 'a') c = (char)(a.charAt(i) - 32); //대문자 
        else  c = (char)(a.charAt(i) + 32); // 소문자
        System.out.print(c);
        }
       
    }
}