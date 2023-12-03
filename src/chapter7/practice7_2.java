package chapter7;

public class practice7_2 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public void solution(int n){
        DFS(n);
    }
    public static void main(String[] args){
        practice7_2 T = new practice7_2();
        T.solution(11);
        //System.out.println(T.solution(3));
    }
}
