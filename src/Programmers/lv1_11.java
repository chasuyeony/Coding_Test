package Programmers;

public class lv1_11 {
    //숫자 문자열과 영단어
    public static int solution(String s) {
        String[] list = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int answer = 0;
        if(s.matches("[+-]?\\d*(\\.\\d+)?")){
            return Integer.parseInt(s);
        }else{
            for(int i = 0 ; i < list.length ; i++){
                s = s.replaceAll(list[i],String.valueOf(i));
            }
            answer = Integer.parseInt(s);
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));

        return ;
    }
}
