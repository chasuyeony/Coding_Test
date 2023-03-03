package Codility;

public class OddOccurrencesInArray {
    static class Solution {

        public static int solution(int[] A) {
            int answer = 0;
            for(int i : A) answer = answer ^ i;
            return answer;
        }

        public static void main(String[] args){
            int[] list = {9,3,9,100,3,9,7,9,7,9,9};
            System.out.println(solution(list));

            return ;
        }

    }
}
