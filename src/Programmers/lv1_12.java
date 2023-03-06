package Programmers;

import java.util.Arrays;

public class lv1_12 {
    //문자열 내림차순으로 배치하기
    public static String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        String[] list = s.split("");
        Arrays.sort(list);

        for(int i = 0 ; i < list.length ; i++){
            sb.append(list[i]);
        }
        answer = sb.reverse().toString();

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("Zzbcdefg"));

        return ;
    }
}
