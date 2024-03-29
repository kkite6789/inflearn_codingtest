package chapter6;

import java.util.Arrays;
import java.util.Scanner;

/*
2. 버블 정렬
설명
N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 버블정렬입니다.

입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

출력
오름차순으로 정렬된 수열을 출력합니다.
 */
public class practice6_2 {

    public static void solution(int n, int[] arr){

        int swap;

        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
//            System.out.println(i+"번째 정렬 중- "+Arrays.toString(arr));
        }
        for(int i=0; i<n; i++){
            if(i>=1){
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        solution(n,arr);
    }
}
