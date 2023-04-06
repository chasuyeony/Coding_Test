package Programmers.lv2;

public class lv2_8 {
    //JadenCase 문자열 만들기
    public static String solution(String s) {
        String answer = "";
        String[] list = s.toLowerCase().split(" ");
        for(int i = 0 ; i < list.length; i++){
            if(list[i].length() == 0){
                answer += " ";
            }else{
                answer += list[i].substring(0,1).toUpperCase();
                answer += list[i].substring(1);
                answer += (i == list.length-1 ? "" : " ");
            }
        }

        //마지막 공백이 기존부터 있었으면 그대로 붙인다
        if(s.substring(s.length()-1).equals(" ")) answer += " ";
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("3people unFollowed me"));
        System.out.println(solution("for the last week  "));

        return ;
    }
}
