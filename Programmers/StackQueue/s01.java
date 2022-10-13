package Programmers.StackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class s01 {
    /*
    [같은 숫자는 싫어]
     */
    static int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]); // 전달받은 arr를 스택에 넣는다
            if (i != 0 && arr[i - 1] == arr[i]) {
                // 만약 첫번째 인덱스가 아니고 스택에 저장된 한칸 앞 값과 현재 추가된 값이 같다면
                // 맨 뒷 값을 빼준다
                stack.pop();
            }
        }

        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }

        answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }

        for (int ii : answer) {
            System.out.print(ii + " ");
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
//        int[] arr = {4,4,4,3,3};
        solution(arr);
    }
}
