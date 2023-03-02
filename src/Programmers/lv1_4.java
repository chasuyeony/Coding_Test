package Programmers;

public class lv1_4 {
    //평균 구하기
    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int tmp : arr){
            sum+=tmp;
        }
        answer = sum/arr.length;
        return answer;
    }

    public static void main(String[] args){
        int[] list = {1,2,3,4};
        int[] list2 = {5,5};

        System.out.println(solution(list));
        System.out.println(solution(list2));

        return ;
    }
}
