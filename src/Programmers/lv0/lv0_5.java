package Programmers.lv0;

public class lv0_5 {
    //편지
    public static int solution(String message) {
        int answer = message.length()*2;
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));

        return ;
    }
}
