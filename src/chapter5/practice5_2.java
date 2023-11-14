package chapter5;

import java.util.Scanner;

/*
2. 괄호문자제거
설명
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
남은 문자만 출력한다.

 */
public class practice5_2 {
    public static String solution(String str){
        StringBuilder answer = new StringBuilder();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                count++;
            }
            else if(str.charAt(i) == ')' && count>0 ){
                count--;
            }
            else if(count==0){
                answer.append(str.charAt(i));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
