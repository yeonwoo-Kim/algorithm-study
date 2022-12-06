package Programmers.Lv1;

import java.util.HashMap;

public class ex16 {
    /**
     * [로또의 최고 순위와 최저 순위]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/77484
     */
    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        int zeroCount = 0;
        int lottoCount = 0;
        HashMap<Integer, Integer> lottoMap = new HashMap<>();
        lottoMap.put(6, 1);
        lottoMap.put(5, 2);
        lottoMap.put(4, 3);
        lottoMap.put(3, 4);
        lottoMap.put(2, 5);

        for (int j : lottos) {
            if (j == 0) {
                zeroCount++;
            } else {
                for (int w : win_nums) {
                    if(w == j) lottoCount++;
                }
            }
        }

        if (zeroCount == 6) {
            answer[0] = 1;
            answer[1] = 6;
        } else {
            int max = lottoCount + zeroCount;
            int min = lottoCount;
            if(max <= 1) answer[0] = 6;
            else answer[0] = lottoMap.get(max);
            if(min <= 1) answer[1] = 6;
            else answer[1] = lottoMap.get(min);
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

//        int[] lottos = {0, 0, 0, 0, 0, 0};
//        int[] win_nums = {38, 19, 20, 40, 15, 25};
//
//        int[] lottos = {45, 4, 35, 20, 3, 9};
//        int[] win_nums = {20, 9, 3, 45, 4, 35};

//        int[] lottos = {21, 8, 2, 44, 1, 34};
//        int[] win_nums = {20, 9, 3, 45, 4, 35};

        solution(lottos, win_nums);
    }
}
