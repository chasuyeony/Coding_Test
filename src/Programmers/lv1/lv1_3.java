package Programmers.lv1;

public class lv1_3 {
    //최대공약수와 최소공배수
    public static int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        // 최소 공배수 = 두 수의 곱 / 최대공약수
        return new int[] { a, n * m / a };
    }

    public static void main(String[] args){
        System.out.println(solution(3,12));
        System.out.println(solution(2,5));

        return ;
    }
}
