package chapter1;

import java.util.Scanner;

public class practice1_4 {

    public static void solution(int a){
        Scanner sc = new Scanner(System.in);

        String word = null;
        String[] words = new String[a];
        String reverseWord = null;

        for(int i=0; i<a; i++)
        {

            word = sc.nextLine();
            words[i] = word;
        }
        for(int j=0; j<words.length; j++)
        {
            reverseWord="";
            for(int k=words[j].length(); k>0; k--)
            {
                reverseWord += words[j].charAt(k-1);
            }
            System.out.println(reverseWord);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int input1 = sc.nextInt();
        sc.nextLine();
        solution(input1);

    }
}