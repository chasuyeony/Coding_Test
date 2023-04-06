package Programmers.lv1;

public class lv1_20 {
    //없는 숫자 더하기
    public static int solution(int[] numbers) {
        int answer = 0;

        for(int i = 0 ; i <= 9 ; i++) answer+=i;
        for(int i = 0 ; i < numbers.length ; i++) answer-=numbers[i];

        return answer;
    }

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9};

        System.out.println(solution(numbers));
        System.out.println(solution(numbers2));

        return ;
    }
}
