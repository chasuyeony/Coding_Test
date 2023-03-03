package Codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {
    static class Solution {

        public static int solution(int[] A) {
            int sum = 0, left = 0, right = 0;
            List sumList = new ArrayList();

            for(int a : A) sum+=a;

            for(int i = 1 ; i < A.length ; i++){
                left += A[i-1];
                right = sum-left;
                sumList.add(Math.abs(left-right));
            }

            return (int) Collections.min(sumList);
        }

        public static void main(String[] args){
            int[] list = {3,1,2,4,3};
            System.out.println(solution(list));

            return ;
        }

    }
}
