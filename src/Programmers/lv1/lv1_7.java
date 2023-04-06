package Programmers.lv1;

public class lv1_7 {
    //문자열 다루기 기본
    public static boolean solution(String s) {
        boolean answer = true;
        if(!((s.length() == 4 || s.length() == 6) && s.replaceAll("[0-9]","").equals(""))) answer = false;
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));

        return ;
    }
}
