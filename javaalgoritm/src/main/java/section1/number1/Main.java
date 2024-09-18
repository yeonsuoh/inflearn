package section1.number1;

import java.util.Scanner;

public class Main {

    // initial answer
    // 내가 작성한 답 -> 백준 방식으로 작성
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next().toLowerCase();
        // 강의와 비교
        // 문자열 변수명 : 강의에서는 str
        String character = kb.next().toLowerCase();
        // 문자 변수명 : 강의에서는 c.
        // 문자 변수 선언 = kb.next().charAt(0)
        // 강의에서는 toUpperCase
        char x = character.toCharArray()[0];

        int count = 0;

        char[] charArray = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            if (charArray[i] == x)
                count++;
        }

        System.out.println(count);
    }

    /**
     * 강의 내용 보며 정리
     */

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) answer++;
//        }
        // 향상된 for 문 방식
        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }


        return answer;
    }

    // 강의 정답
    public void lecture() {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }

}
