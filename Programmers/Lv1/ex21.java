package Programmers.Lv1;

import java.util.ArrayList;
import java.util.Stack;

public class ex21 {
    /**
     * [2019 카카오 개발자 겨울 인턴십 - 크레인 인형뽑기 게임]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/64061
     */
    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Stack<Integer>> boardStack = new ArrayList<>();
        Stack<Integer> bucket = new Stack<>();

        for (int j = 0; j < board.length; j++) {
            Stack<Integer> stack = new Stack<>();
            for (int i = board.length - 1; i >= 0; i--) {
                if(board[i][j] != 0) stack.add(board[i][j]);
            }
            boardStack.add(j, stack);
        }

        for (int m : moves) {
            m = m - 1;
            if (!boardStack.get(m).isEmpty()) {
                int top = boardStack.get(m).peek();
                if (!bucket.isEmpty()) {
                    if (bucket.peek() == top) {
                        bucket.pop();
                        answer += 2;
                    } else bucket.push(top);
                } else bucket.push(top);
                boardStack.get(m).pop();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        solution(board,moves);
    }
}
