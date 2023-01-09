package Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryGap {
    static class Solution {

        public static int solution(int N) {
            String[] data = Integer.toBinaryString(N).split("");
            int cnt = 0;
            int max = 0;

            for(int i = 0 ; i < data.length ; i++){
                if(data[i].equals("0")) cnt++;
                else{
                    max = max > cnt ? max : cnt;
                    cnt = 0;
                }
            }
            return max;
        }

        public static void main(String[] args){
            int[] list = {};
            System.out.println(solution(529));

            return ;
        }

    }
}
