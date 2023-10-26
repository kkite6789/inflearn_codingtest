package chapter1;

import java.util.Locale;
import java.util.Scanner;

public class practice1_8 {

    public static String solution(String word) {

        String answer = "YES";
        word = word.toLowerCase().replaceAll("[^a-z]","");

        for(int i=0; i<word.length()/2; i++)
        {
            if(word.charAt(i) != word.charAt(word.length()-i-1))
            {
                answer = "NO";
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String answer = solution(word);
        System.out.println(answer);
    }
}
