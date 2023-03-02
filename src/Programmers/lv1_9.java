package Programmers;

import java.util.ArrayList;

public class lv1_9 {
    //햄버거 만들기
    public static int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : ingredient){
            list.add(i);

            if(list.size() >= 4){
                if(list.get(list.size()-4) == 1 && list.get(list.size()-3) == 2
                        && list.get(list.size()-2) == 3 && list.get(list.size()-1) == 1){
                    answer++;
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] list = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] list2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};

        System.out.println(solution(list));
        System.out.println(solution(list2));

        return ;
    }
}
