package Programmers.Hash;

import java.util.HashMap;

public class s03 {
    public boolean solution03(String[] phone_book) {
        /*
        [전화번호 목록]
        전화번호 목록을 HashMap의 key로 저장 후 첫번째 원소부터 문자열을 잘라 접두사로 붙은 전화번호를 찾아낸다.
         */
        boolean answer = true;
        HashMap<String, Integer> hm = new HashMap<>();

        for (String p : phone_book) {
            hm.put(p, 0);
        }
        // key값을 사용하지 않고 이중for문으로 찾아낸 초기 코드
        // 결과는 맞으나 정확성 및 효율성 테스트에서 실패
//        for (int j = 0; j < hm.size(); j++) {
//            for (int k = 0; k < hm.size(); k++) {
//                if ((j!=k)&&(hm.get(j)).contains(hm.get(k))) {
//                    answer = false;
//                    break;
//                }
//            }
//        }

        // HashMap key값을 비교해 도출한 결과
        // 풀이 참고
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                String str;
                str = phone_book[i].substring(0, j);
                if (hm.containsKey(str)) {
                    answer=false;
                    break;
                }
            }
        }
        return answer;
    }
}
