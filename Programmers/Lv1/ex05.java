package Programmers.Lv1;

public class ex05 {
    /*
    [콜라 문제]
     */
    static int solution(int a, int b, int n) {
        int answer = 0;
        while(true) {
            int other = 0;
            if(n < a) {
                break;
            }
            answer += (n / a) * b;
            other = n % a;

            n = (n / a) * b + other;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;

//        int a = 3;
//        int b = 1;
//        int n = 20;

        solution(a, b, n);
    }
}
