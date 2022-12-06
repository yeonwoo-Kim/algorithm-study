package Programmers.Lv1;

public class ex17 {
    /**
     * [음양 더하기]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/76501
     */
    static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) answer += absolutes[i];
            else answer += absolutes[i] * -1;
        }
        return answer;
    }


    public static void main(String[] args) {
//        int[] absolutes = {4,7,12};
//        boolean[] signs = {true,false,true};

        int[] absolutes = {1,2,3};
        boolean[] signs = {false, false, true};

        solution(absolutes, signs);
    }
}
