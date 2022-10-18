package Programmers.StackQueue;

import java.util.ArrayList;

public class s02 {
    static int[] solution(int[] progresses, int[] speeds) {
        /*
        [기능개발]
         */
        int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<>();
        // chk: 배포된 기능(원소) 체크 (true: 배포 / false: 미배포)
        boolean[] chk = new boolean[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            // 배포되지 않은 기능(원소) 기준으로 진행 (false)
            if (chk[i] == false) {
                // 작업 진도가 100이 될 때 까지 각 +speeds
                while (progresses[i] < 100) {
                    for (int j = 0; j < progresses.length; j++) {
                        progresses[j] += speeds[j];
                    }
                }

                // 첫번째 배포되는 기능(원소) 체크
                int cnt = 1;
                chk[i] = true;

                // 100이 된 기능(원소) 다음부터 차례로 작업진도 100 체크
                for (int k = i + 1; k < progresses.length; k++) {
                    // 작업진도가 100(이상)이며 배포되지 않은 기능이면
                    if (progresses[k] >= 100 && chk[k] != true) {
                        // 배포될 기능 개수 추가하고 배포되었다는 체크 표시
                        cnt++;
                        chk[k] = true;
                    } else {
                        break;
                    }
                }
                // 총 배포될 개수 순차적 추가
                answerList.add(cnt);
            }
        }

        answer = new int[answerList.size()];
        for (int l = 0; l < answerList.size(); l++) {
            answer[l] = answerList.get(l);
        }

        for (int ii : answer) {
            System.out.print(ii + " ");
        }
        return answer;
    }


    public static void main(String[] args) {
//        int[] arr1 = {93, 30, 55};
//        int[] arr2 = {1, 30, 5};
        int[] arr1 = {95, 90, 99, 99, 80, 99};
        int[] arr2 = {1, 1, 1, 1, 1, 1};

        solution(arr1, arr2);
    }
}
