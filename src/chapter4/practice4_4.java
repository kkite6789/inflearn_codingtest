package chapter4;

import java.util.*;


/*
4. 모든 아나그램 찾기
설명
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

 */
public class practice4_4 {

    public static int solution(String a, String b) {

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        int result = 0;
        int lt = 0;

        //1. bm 에 b의 문자값으로 key 를 만들어준다.(존재하는 갯수 당 value 1씩 오름)
        for (char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

//        bm.forEach((key, value) -> {
//            System.out.println(key + ":" + value);
//        });

        //2. b에서 1을 뺸 만큼만 넣어준다.(뒤의 계산을 쉽게 돌리기 위해 미리 조립)
        int L = b.length() - 1;
        for (int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);

//        am.forEach((key, value) -> {
//            System.out.println(key + ":" + value);
//        });

        // 3. 앞서 조립한 hashmap에 하나씩 추가로 넣어준다.
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            // 3.1 넣어준 후 bm과 비교하여 일치하면 result 값 1씩 증가시킨다.
            if (am.equals(bm)) {
                result++;
            }
            // 3.2 다음 번 루프 때 비교를 위해 제일 이전꺼 하나를 미리 없애준다. 이때 value=1을 뺐을때 value가 0이되면
            // key 가 사라지게끔 remove 해준다.
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if (am.get(a.charAt(lt)) == 0) {
                am.remove(a.charAt(lt));
            }
            // 3.3 다음 번 계산을 위해 없애주는 위치를 1씩 증가시킴 (다음 문자열로)
            lt++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(solution(a,b));

    }
}
