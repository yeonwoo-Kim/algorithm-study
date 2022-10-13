package Programmers.Hash;

import java.util.*;

public class s02 {
    public String solution02(String[] participant, String[] completion) {
        /*
        [완주하지 못한 선수]
        경기에 참가한 선수 배열 participant과 완주한 선수 배열 completion을 모아 중복된 선수는 제거 후 남은 선수(완주하지 못한 선수)를 return한다.
        participant의 길이와 completion의 길이만큼의 배열 sum을 선언하고 participant와 completion를 List로 변환 및 합쳐준다.
        두 배열을 합친 List는 다시 배열로 변환 및 sum으로 넣어준다.
        HashSet을 사용해 sum에서 중복된 선수를 제거하는데, 이 때 이미 set에 같은 선수가 있을 경우 set에서 지워주고(추가하지 않음) 같은 선수가 없을 경우 set에 추가한다.
        Iterator로 set에 남은 선수를 뽑아 return한다.
         */
        String answer = "";
        String[] sum = new String[participant.length + completion.length+1];

        List<String> arr1 = new ArrayList<>(Arrays.asList(participant));
        List<String> arr2 = new ArrayList<>(Arrays.asList(completion));

        arr1.addAll(arr2);

        sum = arr1.toArray(new String[0]);

        HashSet<String> set = new HashSet<>();
        for (String i : sum) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            answer = iterator.next().toString();
        }
        // -----------------------------------------
        /*
        아래는 다른 풀이를 참고하였음
        ** hashMap을 사용하여 hashMap.getOrDefault를 사용해 수행 시간을 줄였다. **
         */
        HashMap<String, Integer> hm = new HashMap<>();

        for(String p : participant) hm.put(p, hm.getOrDefault(p, 0) + 1); // hashMap에 선수 이름을 넣고 값에 +1 해준다.
        for(String p : completion) hm.put(p, hm.get(p)); // 같은 선수이름(같은 key값)이 저장될 경우 기존 값 1에서 -1해준다.

        for (String p : hm.keySet()) {
            // hm에서 key값만 반복한다.
            if(hm.get(p) != 0){
                // 선수 이름의 값이 0이 아닐 경우, 상단 두 개의 반복문에서 -1연산이 되어있지 않았기 때문에 같은 key값에 value를 덮어쓰지 않은 것으로 판단, 즉 중복된 key(선수이름)이 아닌 것으로 확인
                answer = p; // return할 answer에 p(선수이름)을 넣어준다.
                break;
            }
        }
        return answer;
    }
}
