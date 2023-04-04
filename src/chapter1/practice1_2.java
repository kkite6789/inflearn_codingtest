package chapter1;

import java.util.Scanner;

public class practice1_2 {
    public String solution(String str1){
        String translateStr = "";
        for(int i=0; i<str1.length(); i++)
        {
            if(str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
            {
                translateStr+=str1.substring(i,i+1).toLowerCase();
            }
            else
            {
                translateStr+=str1.substring(i,i+1).toUpperCase();
            }
        }

        return translateStr;
    }

    public static void main(String[] args) {
        practice1_2 prac = new practice1_2();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        System.out.println(prac.solution(str1));
    }

}
