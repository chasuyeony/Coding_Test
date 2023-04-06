package Programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class lv1_6 {
    //신규 아이디 추천
    public static String solution(String new_id) {
        String answer = new_id.toLowerCase().replaceAll("[^0-9a-z._-]","");;
        answer = answer.replaceAll("\\.{2,}","."); // 1-3단계
        if(answer.startsWith(".")) answer = answer.substring(1); // 4단계
        if(answer.endsWith(".")) answer = answer.substring(0, answer.length() - 1);
        if(answer.equals("")) answer = "a"; // 5단계
        if(answer.length() > 15){ // 6단계
            answer = answer.substring(0, 15);
            if(answer.endsWith(".")) answer = answer.substring(0, answer.length() - 1);
        }
        if(answer.length() < 3){ // 7단계
            for(int i = answer.length(); i < 3 ; i++){
                answer+=answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution("z-+.^."));
        System.out.println(solution("=.="));
        System.out.println(solution("123_.def"));
        System.out.println(solution(	"abcdefghijklmn.p"));

        return ;
    }
}
