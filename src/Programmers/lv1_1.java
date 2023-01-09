package Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class lv1_1 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> badUser = new HashMap(); //신고받은유저정보
        Map<String, Integer> mailUser = new HashMap();

        //중복신고 제거
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        String[] list = hashSet.toArray(new String[0]);
        //신고받은 유저 값 구하기
        for(int i = 0 ; i < list.length ; i++){
            String[] user = list[i].split(" ");
            if(!badUser.containsKey(user[1])) badUser.put(user[1], 0);
            badUser.put(user[1], badUser.get(user[1])+1);
        }
        //k번 이상받은사람 추출
        for(int i = 0 ; i < list.length ; i++){
            String[] user = list[i].split(" ");
            if(badUser.get(user[1]).intValue() >= k){ //신고한 사람 중 정지 통보 리스트 추출
                if(!mailUser.containsKey(user[0])){
                    mailUser.put(user[0], 1);
                }else{
                    mailUser.put(user[0], mailUser.get(user[0])+1);
                }
            }
        }
        for(int i = 0 ; i < id_list.length ; i++){
            if(mailUser.containsKey(id_list[i])){
                answer[i] = mailUser.get(id_list[i]).intValue();
            }else{
                answer[i] = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        //Programmers.lv1_1 신고결과받기
        String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
        String[] report = new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        System.out.println(solution(id_list, report,2));

        return ;
    }

}