package chapter7;

public class practice7_1 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public void solution(int n){
        DFS(n);
    }
    public static void main(String[] args){
        practice7_1 T = new practice7_1();
        T.solution(3);
        //System.out.println(T.solution(3));
    }
}
