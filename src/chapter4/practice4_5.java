package chapter4;

import java.util.*;

/*
설명
현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.

입력
첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.

출력
첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
 */
public class practice4_5 {

    public static int solution(int n,int k, int[] arr){

        HashMap<Integer,Integer> sumMap = new HashMap<>();
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        int sum;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int m=j+1; m<n; m++){
                    sum=arr[i]+arr[j]+arr[m];
                    sumMap.put(sum,sumMap.getOrDefault(sum,0)+1);
                    tSet.add(sum);
//                    System.out.println(sum);
                }
            }
        }

//        System.out.println("tSet.size()="+tSet.size());
//        System.out.println("tSet.first()="+tSet.first());
//        System.out.println("tSet.last()="+tSet.last());

//        List<Integer> list = new ArrayList<>(sumMap.keySet());
//        Collections.sort(list);
//        Collections.reverse(list);
        int count =0;

        for(int x : tSet){
            count++;
            if(count == k){
                return x;
            }
        }

//        for(int key : list){
//            System.out.println(map.get(key));
//            count++;
//            if(count==k){
//                System.out.println(key);
//            }
//        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}
