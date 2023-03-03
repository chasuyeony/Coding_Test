package Codility;

import java.util.HashSet;

public class FrogRiverOne {
    static class Solution {

        public static int solution(int X, int[] A) {
            HashSet<Integer> list = new HashSet<>();
            int answer = -1;

            for(int i = 0 ; i < A.length ; i++){
                list.add(A[i]);
                if(list.size() == X && list.contains(X)){
                    answer = i;
                    break;
                }
            }

            return answer;
        }

        public static void main(String[] args){
            int[] list = {1,3,3,1,4,2,3,5,4};
            System.out.println(solution(5, list));

            return ;
        }

    }
}
