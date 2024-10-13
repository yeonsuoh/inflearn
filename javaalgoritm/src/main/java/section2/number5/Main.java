package section2.number5;

import java.util.Scanner;

/**
 * 5. 특정 문자 뒤집기
 * 설명
 * <p>
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * <p>
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * <p>
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 * <p>
 * 예시 입력 1
 * <p>
 * a#b!GE*T@S
 * 예시 출력 1
 * <p>
 * S#T!EG*b@a
 */
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.next();

        char[] charArr = line.toCharArray();

        int lt = 0;
        int rt = charArr.length - 1;

        Main main = new Main();
        while (lt < rt) {
            // lt
            if (!main.checkAlphabet(charArr[lt])) {
                lt++;
                continue;
            }
            if (!main.checkAlphabet(charArr[rt])) {
                rt--;
                continue;
            }

            char temp = charArr[lt];
            charArr[lt] = charArr[rt];
            charArr[rt] = temp;

            lt++;
            rt--;
        }
        System.out.println(String.valueOf(charArr));
    }

    // 만약 알파벳이면 둘을 바꾸기
    boolean checkAlphabet(char input) {
        int asciiNumber = (int) input;

        if (65 <= asciiNumber && asciiNumber <= 90 ||
                97 <= asciiNumber && asciiNumber <= 122) {
            return true;
        } else {
            return false;
        }
    }

}
