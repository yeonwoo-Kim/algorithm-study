package AlgorithmCode;

import java.util.Scanner;

public class Greedy {
    /*
    그리디 알고리즘 : 당장 눈 앞에 보이는 최적의 상황만을 쫓는 알고리즘
    - 항상 최적의 결과를 도출하는 것은 아니지만, 어느 정도 최적의 해에 근사한 값을 빠르게 구할 수 있다.
    - 극단적으로 문제에 접근한다는 점에서 정렬기법이 함께 사용되는 경우가 많다.
     */

    public void greedy() {
        // 거슬러주어야 하는 화폐가 들어왔을 때, 총 몇개의 동전으로 이를 거슬러줄 수 있는지 출력한다.
        int m;      // 지불한 금액
        int result = 0; // 동전의 개수
        Scanner scan = new Scanner(System.in);
        System.out.print("지불한 금액: ");
        m = Integer.parseInt(scan.next());

        result += m / 500; // 지불한 금액에서 낼 수 있는 500원의 금액(개수)을 계산
        m %= 500; // 500으로 나눈 나머지 값
        result += m / 100;
        m %= 100;
        result += m / 50;
        m %= 50;
        result += m / 10;

        System.out.println("동전의 개수: " + result);
        System.out.println("실행 시간: " + System.currentTimeMillis() / 1000);

    }
}
