package Programmers.lv1;

import java.util.Arrays;

public class lv1_8 {
    //폰켓몬
    public static int solution(int[] nums) {
        int answer = nums.length/2;
        int[] disNums =  Arrays.stream(nums).distinct().toArray();
        if(disNums.length < answer) answer = disNums.length;
        return answer;
    }

    public static void main(String[] args){
        int[] list = {3,1,2,3};
        int[] list2 = {3,3,3,2,2,4};
        int[] list3 = {3,3,3,2,2,2};

        System.out.println(solution(list));
        System.out.println(solution(list2));
        System.out.println(solution(list3));

        return ;
    }
}
