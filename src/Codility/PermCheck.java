package Codility;

import java.util.Arrays;

public class PermCheck {
    static class Solution {

        public static int solution(int[] A) {
            Arrays.sort(A);
            int answer = 1;

            for(int i = 1 ; i <= A.length ; i++){
                if(A[i-1] != i) return 0;
            }

            return answer;
        }

        public static void main(String[] args){
            int[] list = {4,1,3,2};
            System.out.println(solution(list));

            return ;
        }

    }
}
