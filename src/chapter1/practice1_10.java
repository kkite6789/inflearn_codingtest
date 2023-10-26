package chapter1;

import java.util.Scanner;

/*
설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

 */
public class practice1_10 {

    public static void solution(String word1, String word2) {

        String answerWord = "";

        for(int i=0; i<word1.length(); i++)
        {
            for(int j=0; j<word1.length()-1; j++)
            {
                if(i+j < word1.length())
                {
                    if(word2.charAt(0) == word1.charAt(i+j))
                    {
                        answerWord += j;
                        break;
                    }
                }
                if(i-j > 0)
                {
                    if(word2.charAt(0) == word1.charAt(i-j))
                    {
                        answerWord += j;
                        break;
                    }
                }
            }
            answerWord += " ";
        }
        System.out.println(answerWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        solution(word1,word2);
    }
}
