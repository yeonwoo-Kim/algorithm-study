import AlgorithmCode.*;

import java.util.Scanner;

public class Main {
    // ▶ DFS 구현
//    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
//    static boolean[] checked = new boolean[9]; // 방문처리를 위한 boolean 배열
    static int[] value = new int[1001];
    public static void main(String[] args) {
        /*
        ■ 선택 정렬 (SelectSort)
        AlgorithmCode.SelectSort sort = new SelectSort();
        sort.selectSort();

        ■ 버블 정렬 (BubbleSort)
        AlgorithmCode.BubbleSort sort = new BubbleSort();
        sort.bubbleSort();

        ■ 삽입 정렬 (InsertSort)
        AlgorithmCode.InsertSort sort = new InsertSort();
        sort.insertSort();

        ■ 그리디 알고리즘 (Greedy)
        AlgorithmCode.Greedy g = new Greedy();
        g.greedy();

        ■ 너비 우선 탐색 (BFS)

        - 2차원 배열로 그래프 표현
        - 배열의 인덱스를 노드와 매칭시키기 위해 0번째 인덱스에는 저장x
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
        boolean[] checked = new boolean[9]; // 방문처리를 위한 boolean 배열
        AlgorithmCode.BFS bfs = new BFS();
        System.out.println(bfs.bfs(1, graph, checked));

        ■ 깊이 우선 탐색 (DFS)
        dfs(1);

        ■ 동적 프로그래밍
        AlgorithmCode.DynamicProgramming01 dp = new DynamicProgramming01();
        System.out.println(dp.dp(30));

        ■ 동적 프로그래밍 - 2n 타일링 문제 (BOJ)
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        tiling(n);
        System.out.println(tiling2(n));
         */

    }
    /*
    ■ 동적 프로그래밍 - 2n 타일링 문제 (BOJ)
    static int tiling(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(value[n] != 0) return value[n];
        return value[n] = (tiling(n - 1) + tiling(n -2)) % 10007;
    }

    ■ 동적 프로그래밍 - 2n 타일링 문제 2 (BOJ)
    static int tiling2(int n) {
        if(n == 1) return 1;
        if(n == 2) return 3;
        if(value[n] != 0) return value[n];
        return value[n] = (tiling2(n - 1) + 2 * tiling2(n -2)) % 10007;
    }
     */
    /*
    ■ 깊이 우선 탐색 (DFS)
    static void dfs(int start) {
        // 시작 노드 방문처리
        checked[start] = true;

        System.out.print(start + " ");

        // 방문한 노드에 인접한 노드 찾기
        for (int node : graph[start]) {
            if (!checked[node]) {
                // 재귀 형태로 구현
                dfs(node);
            }
        }
    }
    */
}
