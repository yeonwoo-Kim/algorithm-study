package Programmers.Lv1;

public class ex01 {
    /*
    [기사단원의 무기]
    숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호가 지정되어 있습니다. 기사들은 무기점에서 무기를 구매하려고 합니다.
    각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다.
    단, 이웃나라와의 협약에 의해 공격력의 제한수치를 정하고, 제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 공격력을 가지는 무기를 구매해야 합니다.

    예를 들어, 15번으로 지정된 기사단원은 15의 약수가 1, 3, 5, 15로 4개 이므로, 공격력이 4인 무기를 구매합니다.
    만약, 이웃나라와의 협약으로 정해진 공격력의 제한수치가 3이고 제한수치를 초과한 기사가 사용할 무기의 공격력이 2라면, 15번으로 지정된 기사단원은 무기점에서 공격력이 2인 무기를 구매합니다.
    무기를 만들 때, 무기의 공격력 1당 1kg의 철이 필요합니다. 그래서 무기점에서 무기를 모두 만들기 위해 필요한 철의 무게를 미리 계산하려 합니다.

    기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때,
    무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.
     */
    static int solution(int number, int limit, int power) {
        /*
        1. 1 ~ number까지 각 약수의 개수를 count합니다.
        2. count된 수가 limit이 넘는지 확인하고, limit이 넘을 시 count를 power의 수로 바꿉니다.
        3. answer에 count를 더해줍니다. (철의 무게)
         */
        int answer = 0;
        int count = 0;

        for (int i = 1; i <= number; i++) {
            int sqrt = (int) Math.sqrt(i);  // i의 약수 개수를 구하기 위한 제곱근 값
            count = 0;

            // i의 제곱근 값까지 반복 (전체 중 i의 반까지만 반복)
            for (int j = 1; j <= sqrt; j++) {
                // i의 제곱근 값에 대한 j의 나머지가 0일 경우, 2개의 약수가 나온 것을 추측할 수 있다.
                if (i % j == 0) {
                    count+=2; // 그래서 +2
                    if(j * j == i){ //만약, j의 제곱이 i와 같을 경우 똑같은 약수의 제곱인 것으로 count를 하나 빼준다.
                        count--;
                    }
                }
            }
            // 계산된 count가 limit보다 크면, power값으로 바꿔준다.
            if (count > limit) {
                count = power;
            }

            answer += count;
        }
        return answer;
    }

    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;
//        int number = 10;
//        int limit = 3;
//        int power = 2;
        solution(number, limit, power);
    }
}
