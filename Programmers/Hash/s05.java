package Programmers.Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class s05 {
    static int[] solution(String[] genres, int[] plays) {
        /*
        [베스트앨범]
        // 두번째 코드 (풀이참고)
         */
        int[] answer = {};
        HashMap<String, Integer> hm_genres = new HashMap<>();  // 재생값 별 장르 구분

        for (int j = 0; j < genres.length; j++) {
            hm_genres.put(genres[j], hm_genres.getOrDefault(genres[j], 0) + plays[j]);
        }

        ArrayList<String> genre = new ArrayList<>();
        for (String s : hm_genres.keySet()) {
            genre.add(s);
        }

        // key값에 해당하는 value를 내림차순 정렬
        Collections.sort(genre, (o1, o2) -> hm_genres.get(o2) - hm_genres.get(o1));

        ArrayList<Integer> arrList = new ArrayList<>(); // 고유번호를 저장하기 위한 list

        for (int i = 0; i < genre.size(); i++) {
            String g = genre.get(i);

            // 해당 장르의 곡 중 play횟수가 제일 큰 인덱스 찾기
            int max = 0;
            int firstIdx = -1;

            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }
            // 해당 장르의 곡 중 play횟수가 두번째로 큰 인덱스 찾기
            max = 0;
            int secondIdx = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
                    max = plays[j];
                    secondIdx = j;
                }
            }

            arrList.add(firstIdx);
            if (secondIdx >= 0) {   // secondIdx가 없을 경우 값은 -1이었을 것, 즉 0이상인 경우는 두번째 값이 있기 때문에 arrList에 넣는다
                arrList.add(secondIdx);
            }

            answer = new int[arrList.size()];   // answer 사이즈 지정
            for (int k = 0; k < arrList.size(); k++) {
                answer[k] = arrList.get(k);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(solution(genres, plays));
    }
}
