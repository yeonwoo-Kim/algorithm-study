package Programmers.Lv1;

import java.util.*;

public class ex09 {
    /**
     * [신고 결과 받기]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/92334
     * solution2 : 직접 작성한 코드로, 테스트케이스 3, 21에서 시간 초과로 통과되지 못함
     * solution : 다른 사람의 코드를 참고 (통과)
     */
    static int[] solution2(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];

        // 1. 신고 기록 중 중복 건 제거
        Set<String> set = new HashSet<>(Arrays.asList(report));
        report = set.toArray(new String[0]);

        List<String> id_Array = new ArrayList<>(Arrays.asList(id_list));

        // 2. 신고 당한 user 카운팅
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < report.length; i++) {
            String user = report[i].split(" ")[1];
            hm.put(user, hm.getOrDefault(user, 0) + 1);
        }

        // 3. 신고 당한 user의 카운트가 k 이상일 경우, 신고 당한 user가 있는 신고 기록에서
        //    신고한 id를 ++
        for (String user : hm.keySet()) {
            if (hm.get(user) >= k) {
                for (String reportUser : report) {
                    if (reportUser.split(" ")[1].equals(user)) {
                        answer[id_Array.indexOf(reportUser.split(" ")[0])]++;
                    }
                }

            }
        }

        return answer;
    }

    static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];

        // 1. 각 id에 신고한 user를 추가할 map 생성
        Map<String, HashSet<String>> reportMap = new HashMap<>();
        List<String> id_Array = new ArrayList<>(Arrays.asList(id_list));

        // 2. Map 초기화
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> user = new HashSet<>();
            reportMap.put(id_list[i], user);
        }

        // 3. 신고 기록에서 신고 당한 user에 신고한 id 추가 (HashSet에 id add)
        for (String str : report) {
            String id = str.split(" ")[0];
            String user = str.split((" "))[1];
            reportMap.get(user).add(id);
        }

        // 4. 신고 당한 user의 카운트(신고한 id 수)가 k 이상일 경우
        //    해당 user를 신고한 id에게 보낼 메일 수 ++
        for (String user : reportMap.keySet()) {
            HashSet<String> id = reportMap.get(user);
            if (id.size() >= k) {
                for (String userId : id) {
                    answer[id_Array.indexOf(userId)]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

//        String[] id_list = {"con", "ryan"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//        int k = 3;
        solution(id_list, report,k);
    }
}
