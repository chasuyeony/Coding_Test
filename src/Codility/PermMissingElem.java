package Codility;

import java.util.Arrays;

public class PermMissingElem {
    static class Solution {

        public static int solution(int[] A) {
            int answer = A.length + 1;
            Arrays.sort(A);
            for(int i = 0 ; i < A.length ; i++){
                if(A[i] != i+1){ answer = i+1; break;}
            }
            return answer;
        }

        public static void main(String[] args){
            int[] list = {2,3,1,5};
            System.out.println(solution(list));

            return ;
        }

    }
}
