package Programmers.Lv1;

public class ex12 {
    static int solution(int[] numbers) {
        int answer = -1;
        for (int i = 0; i <= 9; i++) {
            answer+=i;
        }
        for (int j : numbers) {
            answer -= j;
        }
        answer = answer+1;

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
//        int[] numbers = {5,8,4,0,6,7,9};
        solution(numbers);
    }
}
