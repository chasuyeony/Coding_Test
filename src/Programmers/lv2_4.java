package Programmers;

import java.util.Arrays;

public class lv2_4 {
    //최댓값과 최솟값
    public static String solution(String s) {
        String answer = "";
        String[] strList = s.split(" ");
        int[] list = new int[strList.length];
        for(int i = 0 ; i < strList.length ; i++){
            list[i] = Integer.parseInt(strList[i]);
        }
        Arrays.sort(list);
        answer = list[0]+" "+list[list.length-1];

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));

        return ;
    }
}
