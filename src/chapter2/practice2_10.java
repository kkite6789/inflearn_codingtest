package chapter2;

import java.util.Scanner;

/*
지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
격자의 가장자리는 0으로 초기화 되었다고 가정한다.
만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

출력
봉우리의 개수를 출력하세요.

 */
public class practice2_10 {

    public static int solution(int num, int[][] arr) {

        int count = 0;
        //봉우리 구하기
        for(int i=1; i<num+1; i++){
            for(int j=1; j<num+1; j++){
                // 상 좌 하 우 순으로 보다 큰지 비교 크면 count 증가
                if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j+1]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num+2][num+2];

        //격자판에 넣기
        for(int i=0; i<num+2; i++){
            for (int j=0; j<num+2; j++){
                if(i==0 || i==num+1 || j==0 || j==num+1) {
                    arr[i][j] = 0;
                }
                else{
                    arr[i][j] = sc.nextInt();
                }
            }
        }
//        격자판 출력
//        for(int i=0; i<num+2; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
        System.out.println(solution(num,arr));
    }
}
