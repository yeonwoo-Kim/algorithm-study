package Programmers.StackQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class s03 {
    /*
    [Lv.2 프린터]
     */
    static int solution(int[] priorities, int location) {
        int answer = 0;

        // 높은 숫자가 우선순위인 int 형 우선순위형 큐 선언
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : priorities) {
            maxQueue.add(i);
        }
        while (!maxQueue.isEmpty()) {
            for (int j = 0; j < priorities.length; j++) {
                // maxQueue의 값과 priorities의 값이 같은 지 체크
                if (priorities[j] == maxQueue.peek()) {
                    // 같으면 순서 +1
                    answer++;
                    // 첫번째 값 제거
                    maxQueue.poll();

                    // location과 j가 같은 지 확인, 같다면 순서 return
                    if (j == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
//        int[] arr = {2, 1, 3, 2};
//        int l = 2;
        int[] arr = {1, 1, 9, 1, 1, 1};
        int l=0;
        solution(arr, l);
    }
}
