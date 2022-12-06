package Programmers.Lv1;

public class ex18 {
    /**
     * [2021 KAKAO BLIND RECRUITMENT - 신규 아이디 추천]
     * 출처 - https://school.programmers.co.kr/learn/courses/30/lessons/72410
     */
    public static String solution(String new_id) {
        String answer = "";
        answer = seven(six(five(four(three(two(one(new_id)))))));
        return answer;
    }

    static String one(String id) {
        for (char s : id.toCharArray()) {
            if(s >= 65 && s <= 90) id = id.replace(s, (char) (s + 32));
        }
        return id;
    }
    static String two(String id) {
        for (char s : id.toCharArray()) {
            if(!(s >= 97 && s <= 122)
                    && !(s >= 48 && s <= 57)
                    && s != 45
                    && s != 46
                    && s != 95) {
                id = id.replace(String.valueOf(s), "");
            }
        }
        return id;
    }

    static String three(String id) {
        while (id.contains("..")) {
            id = id.replace("..", ".");
        }
        return id;
    }

    static String four(String id) {
        if(!id.equals("") && id.charAt(0) == 46) id = id.substring(1, id.length());
        if(!id.equals("") && id.charAt(id.length()-1) == 46) id = id.substring(0, id.length()-1);
        return id;
    }

    static String five(String id) {
        if(id.equals("")) return "a";
        return id;
    }

    static String six(String id) {
        if(id.length() >= 16) id = id.substring(0, 15);
        return four(id);
    }

    static String seven(String id) {
        if(id.length() <= 2) {
            String lastStr = id.substring(id.length() - 1, id.length());
            while(id.length() < 3) {
                id += lastStr;
            }
        }
        return id;
    }
    public static void main(String[] args) {
//        String newId = "...!@BaT#*..y.abcdefghijklm";
//        String newId = "z-+.^.";
        String newId = "=.=";
//        String newId = "123_.def";
//        String newId = "abcdefghijklmn.p";

        solution(newId);
    }
}
