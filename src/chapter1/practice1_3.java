package chapter1;

import java.util.Scanner;

public class practice1_3 {
    public String solution(String str1){
        String[] str2 = str1.split(" ");
        String str3="";

        for(int i=0; i<str2.length; i++)
        {
            if(str3.length()<str2[i].length())
            {
                str3 = str2[i];
            }
        }
        return str3;
    }

    public static void main(String[] args) {
        practice1_3 prac = new practice1_3();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        System.out.println(prac.solution(str1));
    }
}
