package Programmers.lv1;

public class lv1_1 {
    //옹알이(2)
    public static int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0 ; i < babbling.length ; i++){
            String tmp = babbling[i].replaceAll("ayaaya|yeye|woowoo|mama","."); //반복제거
            String[] result = tmp.split("aya|ye|woo|ma");
            if(result.length == 0) answer++; //빈칸유무확인
        }
        return answer;
    }

    public static void main(String[] args){
        String[] list = {"aya", "yee", "u", "maa"};
        String[] list2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        String[] list3 = {"ayaaya", "yeye", "woowoo", "mama"};

        System.out.println(solution(list));
        System.out.println(solution(list2));
        System.out.println(solution(list3));

        return ;
    }
}
