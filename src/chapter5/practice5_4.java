package chapter5;

import java.util.*;

/*
. 후위식 연산(postfix)
설명
후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

입력
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

 */
public class practice5_4 {
    public static int solution(String str){
        int answer;
        int num1;
        int num2;
        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(Character.getNumericValue(x));
            } else if(x == '+' || x == '-' || x == '*' || x == '/'){
                num1 = stack.pop();
                num2 = stack.pop();
//                System.out.println(num1+""+x+""+num2);
                answer = calculation(x,num2,num1);
                stack.push(answer);
//                System.out.println(answer);
            }
        }
        return stack.pop();
    }

    public static int calculation(char x, int num1, int num2){

        switch(x){
            case '+' :
                return num1+num2;
            case '-' :
                return num1-num2;
            case '*' :
                return num1*num2;
            case '/' :
                return num1/num2;
            default :
                throw new IllegalArgumentException("x는 사친연산이 아님 - " + x);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
