package Programmers.lv0;

public class lv0_2 {
    //몫 구하기
    public static int solution(int num1, int num2) {
        int answer = num1/num2;

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(10,5));
        System.out.println(solution(7,2));
        System.out.println(solution(1,100));
        System.out.println(solution(100,1));

        return ;
    }
}
