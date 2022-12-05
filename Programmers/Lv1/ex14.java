package Programmers.Lv1;

import java.util.ArrayList;

public class ex14 {
    /**
     * [완전탐색 - 최소직사각형]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/86491
     */
    static int solution(int[][] sizes) {
        int answer = 0;
        int wMax = 0;
        int hMax = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            wMax = Math.max(wMax, w);
            hMax = Math.max(hMax, h);
        }

        answer = wMax * hMax;
        return answer;
    }

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70},{60, 30},{80, 40}};
//        int[][] sizes = {{10, 7},{12, 3},{8, 15},{14, 7},{5, 15}};
//        int[][] sizes = {{14, 4},{19, 6},{6, 16},{18, 7},{7, 11}};
        solution(sizes);
    }
}
