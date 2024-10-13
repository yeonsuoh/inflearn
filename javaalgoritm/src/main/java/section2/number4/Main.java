package section2.number4;

import java.util.Scanner;

/**
 * 4. 단어 뒤집기
 * 설명
 * <p>
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * <p>
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 * <p>
 * <p>
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
 * 3
 * good
 * Time
 * Big
 * 예시 출력 1
 * <p>
 * doog
 * emiT
 * giB
 */
public class Main {
    // initial answer
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        String[] words = new String[number];
        for (int i = 0; i < number; i++) {
            String inputWord = kb.next();
            words[i] = inputWord;
        }

        for (String word : words) {
            char[] charArray = word.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                System.out.print(charArray[charArray.length - (1 + i)]);
            }
            System.out.println();
        }
    }
}
