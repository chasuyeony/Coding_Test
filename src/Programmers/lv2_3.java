package Programmers;

public class lv2_3 {
    //문자열 압축
    public static int solution(String s) {
        int answer = s.length();
        int count = 1;

        for(int i=1; i<=s.length()/2; i++){
            StringBuilder result = new StringBuilder();
            String base = s.substring(0, i);
            for(int j=i; j<=s.length(); j+=i){
                int endIdx = Math.min(j + i, s.length());
                String compare = s.substring(j, endIdx);
                if(base.equals(compare)){
                    count++;
                } else {
                    if(count >= 2){
                        result.append(count);
                    }
                    result.append(base);
                    base = compare;
                    count = 1;
                }
            }
            result.append(base);
            answer = Math.min(answer, result.length());
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("aabbaccc"));
        System.out.println(solution("ababcdcdababcdcd"));
        System.out.println(solution("abcabcdede"));
        System.out.println(solution("abcabcabcabcdededededede"));
        System.out.println(solution("xababcdcdababcdcd"));

        return ;
    }
}
