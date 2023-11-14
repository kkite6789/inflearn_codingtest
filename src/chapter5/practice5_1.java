package chapter5;

import java.util.Scanner;

/*
1. 올바른 괄호
설명
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

출력
첫 번째 줄에 YES, NO를 출력한다.

 */
public class practice5_1 {

    public static String solution(String str){

        int count = 0;
        String answer;

        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == '('){
                count++;
//                System.out.println("++");
            }
            if(str.charAt(i) == ')'){
                count--;
//                System.out.println("--");
            }
            if(count<0){
                answer = "NO";
                return answer;
            }
        }
        if(count==0){
            answer = "YES";
        }else{
            answer="NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
