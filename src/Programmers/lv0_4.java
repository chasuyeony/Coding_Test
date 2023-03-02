package Programmers;

public class lv0_4 {
    //공 던지기
    public static int solution(int[] numbers, int k) {
        /* 풀이1 꼬아 생각했다.. 아래 return 간단히 수식법생각하기
        int answer = 0;
        if(numbers.length >= k*2){
            answer = k;
        }else{
            int tmp = k*2-numbers.length-2;
            answer = tmp >= numbers.length ? tmp%numbers.length : tmp;
        }
        reutrn numbers[answer];
        */
        return numbers[((k-1)*2)%numbers.length];
    }

    public static void main(String[] args){
        int[] list = {1, 2, 3, 4};
        int[] list2 = {1, 2, 3, 4, 5, 6};
        int[] list3 = {1, 2, 3};

        System.out.println(solution(list,2));
        System.out.println(solution(list2,10));
        System.out.println(solution(list3,3));

        return ;
    }
}
