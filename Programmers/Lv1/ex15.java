package Programmers.Lv1;

public class ex15 {
    /**
     * [약수의 개수와 덧셈]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/77884
     */
    static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);
            int count = 0;
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    count += 2;
                    if (j * j == i) {
                        count--;
                    }
                }
            }
            if (count % 2 == 0) {
                answer += i;
            } else answer -= i;
        }
        return answer;
    }


    public static void main(String[] args) {
        int left =13;
        int right =17;

//        int left =24;
//        int right =27;
        solution(left, right);
    }
}
