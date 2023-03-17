package Programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class lv1_13 {
    //같은 숫자는 싫어
    public static int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length; i++){
            if(i == 0){
                list.add(arr[i]);
            }else if(arr[i-1] != arr[i]){
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {0,1,1,3,4,5,5,5,6,7,2,0,0};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));

        return ;
    }
}
