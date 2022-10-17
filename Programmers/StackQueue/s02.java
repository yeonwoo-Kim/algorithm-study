package Programmers.StackQueue;

import java.util.ArrayList;

public class s02 {
    static int[] solution(int[] progresses, int[] speeds) {
        /*
        1. progresses의 각 원소를 확인한다
        2. 첫번째 원소가 100이 될 때 까지 각 +speeds한다.
        3. 각 날짜를 count++한다.
        4. 첫번째 원소가 100이 되면 다른 원소 중 100이 된 원소를 확인한다.
        5. 카운트된 날짜를 배열에 넣어준다.
        6. 100이 되지 않은 원소를 100이 될 때까지 카운트한다.
        7. 원소가 100이 되면 100이 된 원소의 수를 배열에 넣어준다.
         */

        int[] answer = {};
        int day = 0; // 날짜카운트
        ArrayList<Integer> answerList = new ArrayList<>();
        ArrayList<Integer> q = new ArrayList<>();
//        Queue<Integer> q = new LinkedList<>();

        for (int i : progresses) {
            q.add(i);
        }

        for (int i = 0; i < q.size(); i++) {

            while (q.get(i).intValue() < 100) {
                for (int j = 0; j < q.size(); j++) {
                    progresses[j] += speeds[j];
                    q.set(j, progresses[j] + speeds[j]);
                }
                day++;
            }

            int cnt = 0;
            for (int k = 0; k < progresses.length; k++) {
                if (q.get(k) >= 100) {
                    cnt++;
                }
            }
            answerList.add(cnt);
        }
//        for(int i = 0; i<progresses.length; i++) {
//
//            while (progresses[i] < 100) {
//                for (int j = 0; j < progresses.length; j++) {
//                    progresses[j] += speeds[j];
//                }
//                day++;
//            }
//
//            int cnt = 0;
//            for (int k = 0; k < progresses.length; k++) {
//                if (progresses[k] >= 100) {
//                    cnt++;
//                }
//            }
//            answerList.add(cnt);
//        }

        answer = new int[answerList.size()];
        for (int r = 0; r < answerList.size(); r++) {
            answer[r] = answerList.get(r);
        }

        for (int ii : answer) {
            System.out.print(ii + " ");
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] arr1 = {93, 30, 55};
        int[] arr2 = {1, 30, 5};
//        int[] arr1 = {95, 90, 99, 99, 80, 99};
//        int[] arr2 = {1, 1, 1, 1, 1, 1};

        solution(arr1, arr2);
    }
}
