package chapter2;

import java.util.Scanner;

/*
9. 격자판 최대합
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
최대합을 출력합니다.

 */
public class practice2_9 {

    public static void solution(int[][] arr){

        //1. 각 행의 합
        int sum1 = 0;
        int sum2 = 0;
        int[] score = new int[12];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                    sum1+=arr[i][j];
                    sum2+=arr[j][i];
            }
            score[i] = sum1;
            score[i+arr.length] = sum2;
            sum1=0;
            sum2=0;
        }

        //3. 두 대각선의 합
        for(int i=0; i<arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length-i-1];
        }
        score[10] = sum1;
        score[11] = sum2;

        int max = 0;

        for (int i : score) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][num];

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        solution(arr);
    }

}
