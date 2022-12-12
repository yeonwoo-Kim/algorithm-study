package Programmers.Lv1;

public class ex22 {
    /**
     * [x만큼 간격이 있는 n개의 숫자]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/12954
     */
    static long[] solution(long x, int n) {
        long[] answer = {};
        answer = new long[n];

        for (int i = 0; i < n; i++) {
            long value = x * (i + 1);
            answer[i] = value;
        }
        return answer;
    }

    public static void main(String[] args) {
        int x=2;
        int n=5;

//        int x=4;
//        int n=3;
//
//        int x=-4;
//        int n=2;
        solution(x,n);
    }
}
