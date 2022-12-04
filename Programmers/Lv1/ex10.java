package Programmers.Lv1;

public class ex10 {
    /**
     * [나머지가 1이 되는 수 찾기]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/87389
     */
    static int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n= 10;
//        int n = 12;
        solution(n);
    }
}
