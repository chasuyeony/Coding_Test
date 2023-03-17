package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class lv2_7 {
    //프린터
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : priorities){
            pq.offer(n);
        }

        while (!pq.isEmpty()){
            for(int i = 0 ; i < priorities.length ; i++){
                if(pq.peek() == priorities[i]){
                    pq.poll();
                    answer++;
                    if(location == i) return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int[] priorities = {2, 1, 3, 2};
        int[] priorities2 = {1, 1, 9, 1, 1, 1};

        System.out.println(solution(priorities,2));
        System.out.println(solution(priorities2,0));

        return ;
    }
}
