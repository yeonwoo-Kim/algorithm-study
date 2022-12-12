package Programmers.Lv1;

import java.util.Arrays;

public class ex23 {
    /**
     * [체육복]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/42862
     */
    static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {1, 3, 5};

//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {3};
//
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

        solution(n, lost, reserve);
    }
}
