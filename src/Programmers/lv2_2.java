package Programmers;

public class lv2_2 {
    //피보나치 수
    public static int solution(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        answer[1] = 1;
        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }

        return answer[n];
    }

    public static void main(String[] args){
        System.out.println(solution(3));
        System.out.println(solution(5));

        return ;
    }
}
