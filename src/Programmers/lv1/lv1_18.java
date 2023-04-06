package Programmers.lv1;


import java.util.Arrays;
import java.util.Collections;

public class lv1_18 {
    //핸드폰 번호 가리기
    public static String solution(String phone_number) {
        String frontNb = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
        String answer = frontNb+phone_number.substring(phone_number.length()-4,phone_number.length());

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));

        return ;
    }
}
