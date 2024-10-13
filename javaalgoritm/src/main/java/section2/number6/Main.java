package section2.number6;

import java.util.Scanner;

/**
 * 6. 중복문자제거
 * 설명
 *
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 *
 * 입력
 *
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 *
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 *
 *
 * 예시 입력 1
 *
 * ksekkset
 * 예시 출력 1
 *
 * kset
 */
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();

        char[] charArr = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        outerloop:
        for (int i = 0; i <= charArr.length - 1; i++) {
            // 0.1.2.3.4.5.6.7
            // k s e k k s e t
            for(int j = i-1; j >= 0; j--) {
                if (charArr[i] == charArr[j]) continue outerloop;
            }
            sb.append(charArr[i]);
        }

        System.out.println(sb);
    }
}
