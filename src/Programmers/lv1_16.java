package Programmers;


public class lv1_16 {
    //자연수 뒤집어 배열로 만들기
    public static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        String[] str = String.valueOf(n).split("");

        for(int i = 0 ; i < str.length ; i++){
            answer[i] = Integer.parseInt(str[str.length-i-1]);
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(12345));

        return ;
    }
}
