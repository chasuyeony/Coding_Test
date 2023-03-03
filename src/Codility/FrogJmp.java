package Codility;

public class FrogJmp {
    static class Solution {

        public static int solution(int X, int Y, int D) {
            if(X >= Y) return 0;
            else return (int) (Math.ceil((Y-X)/(double) D));
        }

        public static void main(String[] args){
            System.out.println(solution(10, 85, 30));

            return ;
        }

    }
}
