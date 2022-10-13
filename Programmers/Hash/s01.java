package Programmers.Hash;

import java.util.HashSet;

public class s01 {
    public int solution01(int[] nums) {
        /*
        [폰켓몬]
        HashSet을 사용하여 nums 원소를 중복 제거한다.
        중복 제거한 원소들과 기존 nums의 n/2값을 비교해 더 많은 종류의 원소를 가져갈 수 있는 최댓값을 구한다.
         */
        int max = nums.length / 2;

        HashSet<Integer> h = new HashSet<>();

        for (int i : nums) {
            h.add(i);
        }
        return h.size() < max ? h.size() : max;
    }
}
