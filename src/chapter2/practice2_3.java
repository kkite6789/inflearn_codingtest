package chapter2;

import java.util.Arrays;
import java.util.Scanner;

/*
설명

A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
예를 들어 N=5이면
두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.

 */
public class practice2_3 {

    public static void solution(int num, String player1, String player2)
    {
        int[] player1Point = new int[num];
        int[] player2Point = new int[num];

        for(int i=0; i<num; i++)
        {
            player1Point[i] = Integer.parseInt(Arrays.toString(player1.split(" ")));
            player2Point[i] = Integer.parseInt(Arrays.toString(player2.split(" ")));

            if((player1Point[i]==2 && player2Point[i]==1) || (player1Point[i]==3 && player2Point[i]==2) || (player1Point[i]==1 && player2Point[i]==3))
            {
                System.out.println("A");
            }
            else if((player1Point[i]==1 && player2Point[i]==2) || (player1Point[i]==2 && player2Point[i]==3) || (player1Point[i]==3 && player2Point[i]==1))
            {
                System.out.println("B");
            }
            else if(player1Point[i]==(player2Point[i]))
            {
                System.out.println("D");
            }
            else
            {
                System.out.println("error");
            }
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        String player1 = sc.nextLine();
        String player2 = sc.nextLine();

        solution(num,player1,player2);

    }
}
