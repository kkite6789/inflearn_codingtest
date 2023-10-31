package chapter2;

import java.util.ArrayList;
import java.util.Scanner;

/*
6. 뒤집은 소수
설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.

출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 */
public class practice2_6 {

    public static void solution(int num, String str){
        String[] arr = str.split(" ");
        String reverseStr = "";
        int check = 0;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=arr[i].length()-1; j>=0; j--)
            {
                reverseStr += arr[i].substring(j,j+1);
            }
            check = makePrimeNum(Integer.parseInt(reverseStr));

            if(check==1)
            {
                System.out.print(Integer.parseInt(reverseStr)+" ");
            }
            reverseStr = "";
        }
    }

    public static int makePrimeNum(int num){

        for(int i=0; i<num; i++)
        {
            if(num<2)
            {
                return 0;
            }
            if(num==2)
            {
                return 1;
            }
            for(int j=2; j<num; j++)
            {
                if(num % j == 0)
                {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        solution(num,str);
    }
}
