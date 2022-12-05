package Programmers.Lv1;

public class ex11 {
    /**
     * [부족한 금액 계산하기]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/82612
     */
    static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price*i;
        }
        if(sum > money) answer = sum-money;
        else answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        int p=3;
        int m=20;
        int c=4;
        solution(p,m,c);
    }
}
