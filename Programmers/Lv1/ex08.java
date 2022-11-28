package Programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ex08 {
    /**
     * [숫자 짝꿍]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/131128
     *  solution : 다른 풀이 참고
     *  solution2 : 통과하지 못한 풀이
     */
    static String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] cntX = new int[10];
        int[] cntY = new int[10];

        for (String xx : X.split("")) cntX[Integer.parseInt(xx)]++;
        for (String yy : Y.split("")) cntY[Integer.parseInt(yy)]++;

        for (int i = 9; i >= 0; i--) {
            while (cntX[i] > 0 && cntY[i] > 0) {
                sb.append(i);
                cntX[i]--;
                cntY[i]--;
            }
        }

        if (sb.toString().equals("")) {
            answer = "-1";
        } else if (sb.toString().substring(0,1).equals("0")) {
            answer = "0";
        } else {
            answer = sb.toString();
        }

        System.out.println(answer);
        return answer;
    }

    static String solution2(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : X.split("")) {
            hm.put(s, hm.getOrDefault(s, 0));
        }

        for (String s : Y.split("")) {
            if(hm.containsKey(s)) {
                hm.put(s, hm.getOrDefault(s, 0) + 1);
            }
        }

        List<String> keySet = new ArrayList<>(hm.keySet());
        Collections.reverse(keySet);

        for (String s : keySet) {
            if (hm.get(s) > 0) {
                for (int k = 0; k < hm.get(s); k++) {
                    sb.append(s);
                }
            }
        }

        if (sb.toString().equals("")) {
            answer = "-1";
        } else {
            answer = String.valueOf(Integer.parseInt(sb.toString()));
        }
        return answer;
    }

    public static void main(String[] args) {
//        String X = "100";
//        String Y = "2345";

//        String X = "100";
//        String Y = "203045";
//
//        String X = "100";
//        String Y = "123450";
//
//        String X = "12321";
//        String Y = "42531";
//
        String X = "5525";
        String Y = "1255";

//        solution(X, Y);
        solution2(X, Y);
    }
}
