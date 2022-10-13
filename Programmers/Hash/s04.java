package Programmers.Hash;

import java.util.HashMap;
import java.util.Iterator;

public class s04 {
    public int solution04(String[][] clothes) {
        /*
        [위장]
        1. 옷을 종류별로 구분한다
        2. 입지 않는 경우를 추가해서 모든 조합을 계산한다.
        3. 아무 종류의 옷도 입지 않는 경우는 제외한다.
         */
        int answer = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        for (String[] c : clothes) {
            String type = c[1];
            hm.put(type, hm.getOrDefault(type, 0) + 1);
        }

        Iterator<Integer> itor = hm.values().iterator();
        answer = 1;
        while (itor.hasNext()) {
            answer *= itor.next() + 1;
        }
        return answer - 1;
    }
}
