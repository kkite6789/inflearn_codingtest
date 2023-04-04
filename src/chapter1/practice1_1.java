package chapter1;

import java.util.Scanner;

public class practice1_1 {

    public int solution(String str1, char str2){
        int countNum = 0;
        /* 1번재 방법 반복문 이용하여 일치하면 count시키기*/
        for(int i=0; i<str1.length(); i++)
        {
            if(str1.charAt(i) == str2)
            {
                countNum++;
            }
        }
        /* 2번째 방법 해당값을 빈칸으로 replace 시킨 후 length 구하기*/
//        countNum = str1.length()-str1.replace(String.valueOf(str2),"").length();

        return countNum;
    }

    public static void main(String[] args) {
        practice1_1 prac = new practice1_1();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toUpperCase();
        char str2 = sc.next().toUpperCase().charAt(0);

        System.out.println(prac.solution(str1,str2));
    }
}
