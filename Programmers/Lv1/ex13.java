package Programmers.Lv1;

import java.util.HashMap;
import java.util.Map;

public class ex13 {
    /**
     * [2021 카카오 채용연계형 인턴십 - 숫자 문자열과 영단어]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/81301
     */
    static int solution(String s) {
        int answer = 0;
        Map<String, String> words = new HashMap<>();

        words.put("zero", "0");
        words.put("one", "1");
        words.put("two", "2");
        words.put("three", "3");
        words.put("four", "4");
        words.put("five", "5");
        words.put("six", "6");
        words.put("seven", "7");
        words.put("eight", "8");
        words.put("nine", "9");

        for (String str : words.keySet()) {
            if (s.contains(str)) {
                s = s.replace(str, words.get(str));
            }
        }
        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        String s="one4seveneight";
//        String s="23four5six7";
//        String s="2three45sixseven";
//        String s="123";

        solution(s);
    }
}
