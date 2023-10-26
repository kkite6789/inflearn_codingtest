package chapter1;

import java.util.Scanner;

public class practice1_5 {

    public static boolean isAlpha(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }

    public static String[] swapAlpha(String word) {

        String[] reverseWord = new String[word.length()];

        for (int i = 0; i < word.length(); i++)
        {
            if(!isAlpha(String.valueOf(word.charAt(i))))
            {
                reverseWord[i] = String.valueOf(word.charAt(i));
            }
//            System.out.println(reverseWord[i]);
        }

//        System.out.println("===========================");
        for (int j = 0; j < word.length(); j++)
        {
            if(isAlpha(String.valueOf(word.charAt(j))))
            {
                for(int k=1; k<=word.length(); k++)
                {
                    if(reverseWord[word.length()-k] == null)
                    {
                        reverseWord[word.length()-k] = String.valueOf(word.charAt(j));
                        break;
                    }
                }
            }
        }
        return reverseWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String[] reverseWord = swapAlpha(word);

        for (int k = 0; k < word.length(); k++)
        {
            System.out.printf(reverseWord[k]);
        }
    }
}
