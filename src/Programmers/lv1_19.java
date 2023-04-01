package Programmers;


import java.util.Arrays;

public class lv1_19 {
    //K번째수
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0 ; i < commands.length; i++){
            int[] data = new int[commands[i][1]-commands[i][0]+1];
            int cnt = 0;
            for(int j = commands[i][0]-1 ; j < commands[i][1] ; j++){
                data[cnt] = array[j];
                cnt++;
            }
            Arrays.sort(data);
            answer[i] = data[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1},{1,7,3}};

        System.out.println(solution(array,commands));

        return ;
    }
}
