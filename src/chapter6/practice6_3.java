package chapter6;

import java.util.Scanner;

/*
3. 삽입 정렬
설명
N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 삽입정렬입니다.

입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

출력
오름차순으로 정렬된 수열을 출력합니다.
 */
public class practice6_3 {

    public static void solution(int n, int[] arr){
//        int keep;

//        for(int i=1; i<n; i++){
//            keep=arr[i];
//            for(int j=i; j<0; j--){
//                if(j==0){
//                    arr
//                }
//                if(keep>arr[j-1]){
//                    keep=arr[j-1];
//
//                }
//                else if(keep<arr[j-1]){
//                    arr[j-1]=arr[j];
//                }
//            }

//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        solution(n,arr);
    }
}
