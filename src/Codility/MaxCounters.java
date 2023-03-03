package Codility;

public class MaxCounters {
    static class Solution {

        public static int[] solution(int N, int[] A) {
            int[] arr = new int[N];
            int max = 0, aftMax = 0;
            boolean mode = false;

            for(int i : A){
                if(i > N){
                    aftMax = max;
                    mode = true;
                    continue;
                }

                if(mode){
                    arr[i-1] = (arr[i-1] < aftMax) ? aftMax : arr[i-1];
                }
                arr[i-1]++;
                max = (max < arr[i-1]) ? arr[i-1] : max;
            }

            for (int i=0; i < arr.length; i++) {
                if(arr[i] < aftMax) arr[i] = aftMax;
            }
            return arr;
        }

        public static void main(String[] args){
            int[] list = {3,4,4,6,1,4,4};
            System.out.println(solution(5, list));

            return ;
        }

    }
}
