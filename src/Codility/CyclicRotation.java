package Codility;

public class CyclicRotation {
    static class Solution {

        public static int[] solution(int[] A, int K) {
            if(A.length == 0) return A;
            for(int i = 0 ; i < K ; i++){
                int tmp = A[A.length-1];
                for(int j = A.length-1 ; j > 0 ; j--){
                    A[j] = A[j-1];
                }
                A[0] = tmp;
            }

            return A;
        }

        public static void main(String[] args){
            int[] list = {};
            System.out.println(solution(list, 3));

            return ;
        }

    }
}
