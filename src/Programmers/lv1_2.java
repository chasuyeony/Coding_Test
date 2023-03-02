package Programmers;

public class lv1_2 {
    //푸드 파이트 대회
    public static String solution(int[] food) {
        String answer = "0";
        for(int i = food.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < food[i]/2 ; j++){
                answer =  i+ answer + i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] list = {1, 3, 4, 6};
        int[] list2 = {1,7,1,2};
        int[] list3 = {1,9,10,99,100,999,777,43,1000};

        System.out.println(solution(list));
        System.out.println(solution(list2));
        System.out.println(solution(list3));

        return ;
    }
}
