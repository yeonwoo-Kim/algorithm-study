package AlgorithmCode;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    /*
    너비 우선 탐색 (Breadth First Search, BFS)
    : 탐색을 할 때, 너비를 우선으로 하여 탐색을 수행하는 탐색 알고리즘 (특히 '맹목적인 탐색')
    - 최단 경로를 찾아준다는 점에서 최단 길이를 보장해야 할 때 많이 사용한다.
    - root로부터 거리가 가까운 순서대로 탐색한다.
    - 재귀적으로 동작하지 않는다.
    - 노드의 방문 여부를 검사한다. (한번 방문한 노드는 다시 방문하지 않고, 순차적으로 방문하여 모든 노드 탐색)
    - 큐 Queue 사용 (FIFO)
     */
    public String bfs(int start, int[][] graph, boolean[] checked) {
        // start : 시작점
        // graph : 탐색할 2차원 배열 또는 그래프
        // checked : 방문처리하기 위한 boolean 리스트

        StringBuilder sb = new StringBuilder();       // 탐색 순서를 확인할 sb
        Queue<Integer> q = new LinkedList<>(); // BFS에 사용할 큐 생성

        q.offer(start); // 탐색을 시작할 번호를 queue에 넣어준다
        checked[start] = true;  // 시작노드 방문처리

        while (!q.isEmpty()) {
            int x = q.poll();   // q에 있는 번호(시작번호)를 x에 넣어준다
            sb.append(x).append(" ");

            // q에서 꺼낸 노드와 연결된 노드 체크
            for (int i = 0; i < graph[x].length; i++) {
                int y = graph[x][i];
                if (!checked[y]) { // y를 방문하지 않았다면 방문처리 후 q에 넣는다
                    checked[y] = true;
                    q.offer(y);
                }
            }
        }
        return sb.toString();
    }
}
