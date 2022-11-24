package Programmers.Lv1;

import java.util.HashMap;
import java.util.Map;

public class ex06 {
    /*
    [2022 KAKAO TECH INTERNSHIP - 성격 유형 검사하기]
     */
    static String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);
        Map<String, Integer> mbti = new HashMap<>();

//        for (int i = 0; i < survey.length; i++) {
//            int value = choices[i];
//            if (1 <= value && value <= 3) {
//                mbti.put(String.valueOf(survey[i].charAt(0)), mbti.getOrDefault(String.valueOf(survey[i].charAt(0)), 0) + choices[i] == 1 ? 3 : (choices[i] == 3 ? 1 : 2));
//            } else if (5 <= value && value <= 7) {
//                mbti.put(String.valueOf(survey[i].charAt(1)), mbti.getOrDefault(String.valueOf(survey[i].charAt(1)), 0)+choices[i] == 7 ? 3 : (choices[i] == 5 ? 1 : 2));
//            }
//        }
//
//        sb.append(mbti.get("R") >= mbti.get("T") ? "R" : "T")
//        .append(mbti.get("C") >= mbti.get("F") ? "C" : "F")
//        .append(mbti.get("J") >= mbti.get("M") ? "J" : "M")
//        .append(mbti.get("A") >= mbti.get("N") ? "A" : "N");
//
        for (int i = 0; i < survey.length; i++) {
            int value = choices[i];
            if (1 <= value && value <= 3) {
                mbti.put(String.valueOf(survey[i].charAt(0)), mbti.getOrDefault(String.valueOf(survey[i].charAt(0)), 0) + 4 - value);
            } else if (5 <= value && value <= 7) {
                mbti.put(String.valueOf(survey[i].charAt(1)), mbti.getOrDefault(String.valueOf(survey[i].charAt(1)), 0) + value - 4);
            }
        }

        sb.append(mbti.getOrDefault("R", 0) >= mbti.getOrDefault("T", 0) ? "R" : "T")
                .append(mbti.getOrDefault("C", 0) >= mbti.getOrDefault("F", 0) ? "C" : "F")
                .append(mbti.getOrDefault("J", 0) >= mbti.getOrDefault("M", 0) ? "J" : "M")
                .append(mbti.getOrDefault("A", 0) >= mbti.getOrDefault("N", 0) ? "A" : "N");

        System.out.println(sb.toString());
        return answer;
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

//        String[] survey = {"TR", "RT", "TR"};
//        int[] choices = {7, 1, 3};
        solution(survey, choices);
    }
}
