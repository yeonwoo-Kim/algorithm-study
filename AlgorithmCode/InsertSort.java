package AlgorithmCode;

public class InsertSort {
    /*
     삽입 정렬 : 각 숫자를 필요할 때 적절한 위치에 삽입한다
     - 시간복잡도 O(N^2)
     - 선택 정렬, 버블 정렬과 똑같은 시간복잡도를 가지지만 경우에 따라 가장 빠를 수 있다.

     ▶ 다음의 숫자들을 오름차순으로 정렬하는 프로그램
     ‣ 특정 정렬하고자 하는 원소를 만났을 때, 해당 인덱스의 앞 부분은 정렬이 되어있다는 가정 하에 데이터를 삽입한다. (필요한 만큼만 이동)
     ‣ 필요할 때에 한해서만 삽입을 진행하기 때문에, 데이터가 이미 거의 정렬된 상태에 한해서는 어떤 알고리즘보다 빠르다는 특징을 가진다.
     */

    public void insertSort() {
        int[] arr = {1, 10, 8, 7, 6, 5, 4, 3, 2, 9};
        int temp;
        int i, j;

        for (i = 0; i < 9; i++) {
            j = i;
            while (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
                if (j < 0) break;
            }
        }
        for (i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
