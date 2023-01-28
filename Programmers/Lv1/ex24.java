package Programmers.Lv1;

import java.util.*;

public class ex24 {
    /**
     * [가장 가까운 같은 글자]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/142086
     */
    static int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] stringToChar = s.toCharArray();

        HashMap<Character, Integer> splitCheck = new HashMap<>();

        for (int i = 0; i < stringToChar.length; i++) {
            if (splitCheck.containsKey(stringToChar[i])) {
                answer[i] = i - splitCheck.get(stringToChar[i]);
            } else {
                answer[i] = -1;
            }
            splitCheck.put(stringToChar[i], i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
//        String s = "foobar";
        solution(s);
    }
}
}



