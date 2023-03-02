package Programmers;

public class lv1_10 {
    //크기가 작은 부분문자열
    public static int solution(String t, String p) {
        int answer = 0;

        for(int i = 0 ; i < t.length()-p.length()+1 ; i++){
            if(Long.parseLong(t.substring(i, i+p.length())) <= Long.parseLong((p))){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("3141592","271"));
        System.out.println(solution("500220839878","7"));
        System.out.println(solution("10203","15"));

        return ;
    }
}
