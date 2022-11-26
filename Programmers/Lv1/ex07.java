package Programmers.Lv1;

public class ex07 {
    /**
     * [삼총사]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/131705
     */
    static int solution(int[] number) {
        int answer = 0;
        int value = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                value = number[i] + number[j];
                for (int k = j+1; k < number.length; k++) {
                    if (value + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
//        int[] number = {-2, 3, 0, 2, -5};

        int[] number = {-3, -2, -1, 0, 1, 2, 3};
//        int[] number = {-1, 1, -1, 1};

        solution(number);
    }
}
