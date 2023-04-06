package Programmers.lv2;

import java.util.Arrays;

public class lv2_1 {
    //최솟값 만들기
    public static int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 1 ; i <= A.length ; i++){
            answer += A[i-1]*B[B.length-i];
        }

        return answer;
    }

    public static void main(String[] args){
        int[] A = {1,4,2};
        int[] A2 = {1,2};
        int[] B = {5,4,4};
        int[] B2 = {3,4};
        System.out.println(solution(A,B));
        System.out.println(solution(A2,B2));

        return ;
    }
}
