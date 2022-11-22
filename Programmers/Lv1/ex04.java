package Programmers.Lv1;

public class ex04 {
    static int solution(String[] babbling) {
        /*
        [옹알이 2]
        다른 분의 코드를 참고하여 구현
         */
        int answer = 0;
        String[] str1 = {"aya","ye","woo","ma"};
        String[] str2 = {"ayaaya","yeye","woowoo","mama"};

        for (String b : babbling) {
            for (String re : str2) {
                b = b.replace(re, "X");
            }
            for (String original : str1) {
                b = b.replace(original, "O");
            }

            boolean chk = true;

            for (int i = 0; i < b.length(); i++) {
                if (!b.subSequence(i, i + 1).equals("O")) {
                    chk = false;
                    break;
                }
            }
            if (chk == true) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
//        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        solution(babbling);
    }
}
