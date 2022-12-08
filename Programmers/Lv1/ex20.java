package Programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ex20 {
    /**
     *[두 개 뽑아서 더하기]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/68644
     */
    static int[] solution(int[] numbers) {
        int[] answer = {};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        for (int i : set) {
            list.add(i);
        }

        Collections.sort(list);
        answer = new int[list.size()];

        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] a = {2,1,3,4,1};

//        int[] a = {5,0,2,7};
        solution(a);
    }
}
