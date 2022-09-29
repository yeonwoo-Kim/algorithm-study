package AlgorithmCode;
public class SelectSort {
    public void selectSort() {
        /*
        i     : 배열 탐색
        j     : 배열 탐색
        min   : 최소값
        index : 최소값의 위치
        temp  : 값을 바꾸기 위한 임시 변수

        알고리즘 수행 시간
        -> 10 * (10 + 1) / 2 = 55
        -> n * (n + 1) / 2
        -> n * n
        -> 시간복잡도 : O(n * n)
        처리할 데이터의 개수가 많다면 매우 많은 연산을 처리해야 한다.
        ∴ 다른 정렬 알고리즘과 비교했을 때 비효율적
         */
        int[] arr = {1, 10, 5, 7, 6, 8, 4, 3, 2, 9};
        int min, temp;
        int index = 0;

        for (int i = 0; i < 10; i++) {
            min = 99;   // 임시로 최소값 지정
            for (int j = i; j < 10; j++) {  // i가 반복하며 도는 지점부터 최소값 찾기
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[index] = temp;

            System.out.print(arr[i] + " ");
        }
    }
}
