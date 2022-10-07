package AlgorithmCode;

public class DynamicProgramming01 {
    /*
    동적 프로그래밍 (DP, DynamicProgramming, 동적 계획법)
    : 하나의 큰 문제를 여러 개의 작은 문제로 나누어 결과를 저장, 다시 큰 문제를 해결할 때 저장한 값을 사용한다.
    - 큰 문제를 작은 문제로 '쪼개서', 답을 저장해두고 '재활용'한다.
    - 일반적인 재귀 방식과 유사하지만, 일반적인 재귀를 단순히 사용할 시 동일한 작은 문제들이 여러 번 반복되어 비효율적인 계산이 될 수 있다는 단점이 있다.
    [ex - 피보나치 수열]
    f(n) = f(n - 1) + f(n - 2)
    각 함수를 한번씩 호출하게 되면 동일한 값을 2번씩 구하게 되며, 큰 값이 n으로 들어올 때 함수 동작 횟수는 굉장히 많이 늘어난다.
    √ 그렇다면 한번 구한 작은 문제의 값을 저장해서 함수를 반복할 필요 없이 저장한 값을 꺼내 재사용해보자 ! (시간복잡도 O(n^2) -> O(n)으로 개선)

    * DP의 사용 조건
    1. Overlapping Subproblems (겹치는 부분문제)
    2. Optical Substructure (최적 부분 구조)

    * DP 사용
    1. DP사용으로 풀 수 있는 문제인지 확인
        - 해당 문제가 중복되는 작은 문제들로 이루어져 있는지, 작은 문제들이 하나의 함수로 표현될 수 있는지 파악
    2. 문제의 변수 파악
        -
    3. 변수 간 관계식 만들기
    4. 메모하기 (memoization)
        - 결과 저장
    5. 가장 작은 문제의 상태 확인
    6. 구현
    */
    static int[] value = new int[100];
    public int dp(int x) {
        // x의 값이 클 경우 2^50번의 계산이 이루어진다.
        // 즉, 한번 구한 값은 저장해두고 큰 계산 시 계산된 값을 불러온다.(↑ value 배열)
        if (x == 1) return 1;
        if (x == 2) return 1;
        if (value[x] != 0) return value[x];
        return value[x] = dp(x - 1) + dp(x - 2);
    }
}
