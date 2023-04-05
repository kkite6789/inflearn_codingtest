import java.util.Scanner;

public class Main {
    public String[] solution(int num){
        Scanner sc = new Scanner(System.in);
        String str1 = null;
        String reverseWord = null;

        String[] words = new String[num];
        for(int i=0; i<num; i++)
        {
            reverseWord = "";
            str1 = sc.next();
            for(int j=str1.length()-1; j>=0; j--)
            {
                reverseWord += str1.charAt(j);
            }
            words[i] = reverseWord;
        }

        return words;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String[] result;

        result=main.solution(num);
        for(int i=0; i<result.length; i++)
        {
            System.out.println(result[i]);
        }
    }
}
