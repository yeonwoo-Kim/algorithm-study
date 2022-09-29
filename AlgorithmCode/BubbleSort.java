package AlgorithmCode;

public class BubbleSort {
    /*
    버블정렬 - 가까이에 있는 두 숫자끼리 비교해 당장 더 작은 숫자를 앞으로 보낸다
    • 가장 구현은 쉽지만, 가장 비효율적
    -> 10 + 9 + 8 + 7 + ... + 1
    -> n * (n + 1) / 2
    -> O(n*n)
    • 선택 정렬과 같이 시간복잡도는 O(n*n)이지만, 반복적으로 두 숫자를 비교하며 바꾸기 때문에
    선택 정렬보다 실제 수행시간이 더 느리다
     */

    public void bubbleSort() {
        int[] arr = {1, 10, 5, 7, 6, 8, 4, 3, 2, 9};
        int temp;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < 10; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
