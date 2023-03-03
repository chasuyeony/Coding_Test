package Codility;

import java.util.Arrays;
import java.util.HashSet;

public class MissingInteger {
    static class Solution {

        public static int solution(int[] A) {
            Arrays.sort(A);
            HashSet<Integer> list = new HashSet<>();
            int answer = 1;
            for(int n : A) list.add(n);

            if(A[0] < 1 && A[A.length-1] < 1) return answer;
            for(int i = 1 ; i <= list.size() ; i++){
                if(list.contains(i)) answer = i+1;
                else return answer;
            }

            return answer;
        }

        public static void main(String[] args){
            int[] list = {1,3,6,5,4,1,2};
            System.out.println(solution(list));

            return ;
        }

    }
}
