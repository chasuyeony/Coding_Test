package Programmers;


import java.util.Arrays;
import java.util.Collections;

public class lv1_17 {
    //정수 내림차순으로 배치하기
    public static long solution(long n) {
        long answer = 0;
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String str : list) sb.append(str);

        answer = Long.parseLong(sb.toString());

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(118372));

        return ;
    }
}
