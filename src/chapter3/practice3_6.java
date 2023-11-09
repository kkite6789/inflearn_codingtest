package chapter3;

import java.util.Arrays;
import java.util.Scanner;

/*
6. 최대 길이 연속부분수열
설명

0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
1 1 0 0 1 1 0 1 1 0 1 1 0 1
여러분이 만들 수 있는 1이 연속된 연속부분수열
길이는 8입니다.

입력
첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.

출력
첫 줄에 최대 길이를 출력하세요.

 */
public class practice3_6 {

    public static int solution(int n,int k, int[] arr){
        int count,changeNum;
        int maxNum=0;

        for(int i=0; i<n; i++){
            count=0;
            changeNum=0;
            for(int j=i; j<n; j++){
                if(arr[j]==1){
                    count++;
                }
                if(arr[j]==0 && changeNum == k){
                    break;
                }
                if(arr[j]==0){
                    changeNum++;
                    count++;
                }
            }
            if(maxNum<count){
                maxNum=count;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}
