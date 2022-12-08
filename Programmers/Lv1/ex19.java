package Programmers.Lv1;

import java.util.ArrayList;

public class ex19 {
    /**
     * [카카오 인턴십 - 키패트 누르기]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/67256
     */
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);
        int left = 10;
        int right = 12;

        for (int i : numbers) {
            if ((i == 1) || (i == 4) || (i == 7)) {
                sb.append("L");
                left = i;
            } else if ((i == 3) || (i == 6) || (i == 9)) {
                sb.append("R");
                right = i;
            } else {
                if(i == 0) i = 11;

                int lDistance = (Math.abs(i - left) / 3) + (Math.abs(i - left) % 3);
                int rDistance = (Math.abs(i - right) / 3) + (Math.abs(i - right) % 3);

                if (lDistance == rDistance) {
                    if ("right".equals(hand)) {
                        sb.append("R");
                        right = i;
                    } else {
                        sb.append("L");
                        left = i;
                    }
                } else if (lDistance > rDistance) {
                    sb.append("R");
                    right = i;
                } else {
                    sb.append("L");
                    left = i;
                }

            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String result = "LRLLLRLLRRL";

//        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
//        String hand = "left";
//        String result = "LRLLRRLLLRR";
//
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        String hand = "right";
//        String result = "LLRLLRLLRL";
        if(solution(numbers, hand).equals(result)) System.out.println(true);
        else System.out.println(false);
    }
}
