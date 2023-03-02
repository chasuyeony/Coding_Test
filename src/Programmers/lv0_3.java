package Programmers;

public class lv0_3 {
    //OX퀴즈
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] tmp = quiz[i].split(" "); //공백제거
            if (tmp[1].equals("+")) { //+연산
                if (Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]) == Integer.parseInt(tmp[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else { //-연산
                if (Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]) == Integer.parseInt(tmp[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String[] list = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] list2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        System.out.println(solution(list));
        System.out.println(solution(list2));

        return ;
    }
}
