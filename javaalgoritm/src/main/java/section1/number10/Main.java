package section1.number10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *10. 가장 짧은 문자거리
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 *
 * 예시 입력 1
 * teachermode e
 * 예시 출력 1
 * 1 0 1 2 1 0 1 2 2 1 0
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t = kb.next().charAt(0);

        // 0.1.2.3.4.5.6.7.8.9.10
        int i2 = s.indexOf(t); // 1.5.10
        int i1 = s.indexOf(t, i2+1);

        int index = s.indexOf(t); // 첫번째 등장. 1
        List<Integer> indexArr = new ArrayList<>();
        indexArr.add(index);
        while (index != -1) {
            index = s.indexOf(t, index+1);
            if (index == -1) break;
            indexArr.add(index);
        }

        int[] result = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int minDistance = Integer.MAX_VALUE;
            for (int j : indexArr) {
                int distance = Math.abs(i - j);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
            result[i] = minDistance;
        }

        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
