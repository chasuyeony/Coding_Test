package Programmers.lv1;

import java.util.ArrayList;
import java.util.HashMap;

public class lv1_14 {
    //개인정보 수집 유효기간
    public static int[] solution(String today, String[] terms, String[] privacies) {
        String[] td = today.split("\\.");
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int year = Integer.parseInt(td[0]);
        int month = Integer.parseInt(td[1]);
        int day = Integer.parseInt(td[2]);
        int cnt = (year*12*28)+(month*28)+day;
        int len = 0;

        //약관 달
        for(int i = 0 ; i < terms.length; i++){
            String[] str = terms[i].split(" ");
            hashMap.put(str[0], Integer.parseInt(str[1]));
        }

        for(int i = 0 ; i < privacies.length ; i++){
            String[] str = privacies[i].split("\\.| ");
            int num = hashMap.get(str[3]) == null ? 0 : hashMap.get(str[3]);

            int pYear = Integer.parseInt(str[0]);
            int pMonth = Integer.parseInt(str[1])+num;
            int pDay = Integer.parseInt(str[2]);
            int pCnt = (pYear*12*28)+(pMonth*28)+pDay-1;

            if(cnt > pCnt){
                len++;
                list.add(i+1);
            }
        }

        int[] answer = new int[len];
        for(int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args){
        String[] terms1 = {"A 6", "B 12", "C 3"};
        String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        String[] terms3 = {"A 12"};
        String[] privacies3 = {"2019.12.1 A"};

        System.out.println(solution("2022.05.19",terms1,privacies1));
        System.out.println(solution("2020.01.01",terms2,privacies2));
        System.out.println(solution("2019.12.1",terms3,privacies2));

        return ;
    }
}
