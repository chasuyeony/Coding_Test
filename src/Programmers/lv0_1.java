package Programmers;

public class lv0_1 {
    //옹알이(1)
    public static int solution(String[] babbling) {
        int answer = 0;
        //해당하는 발음이 존재하면 빈칸.
        for(int i = 0 ; i < babbling.length ; i++){
            String[] tmp = babbling[i].split("aya|ye|woo|ma");
            if(tmp.length == 0) answer++; //빈칸유무확인
        }

        return answer;
    }

    public static void main(String[] args){
        String[] list = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] list2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(solution(list));
        System.out.println(solution(list2));

        return ;
    }
}
