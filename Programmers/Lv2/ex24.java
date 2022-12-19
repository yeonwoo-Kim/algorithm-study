package Programmers.Lv2;

public class ex24 {
    /**
     * [타겟 넘버]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/43165
     */
    static int answer;
    static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0);
        return answer;
    }

    static void dfs(int[] numbers, int target, int idx, int sum) {
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(numbers, target, idx + 1, sum + numbers[idx]);
        dfs(numbers, target, idx + 1, sum - numbers[idx]);
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 1, 1, 1, 1};
//        int target=3;

        int[] numbers = {4,1,2,1};
        int target=4;
        solution(numbers, target);
    }
}
