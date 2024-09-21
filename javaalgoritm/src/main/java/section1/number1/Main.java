package section1.number1;

import java.util.Scanner;

/**
 * 1. 문자 찾기
 * 설명
 *
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 해당 문자의 개수를 출력한다.
 *
 *
 * 예시 입력 1
 *
 * Computercooler
 * c
 * 예시 출력 1
 *
 * 2
 */
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
