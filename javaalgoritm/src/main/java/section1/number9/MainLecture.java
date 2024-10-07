package section1.number9;

import java.util.Scanner;

public class MainLecture {
    public int solution(String s) {
//        int answer = 0;
//        for (char x : s.toCharArray()) {
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);
//            }
//        }

        StringBuilder answer = new StringBuilder();
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                answer.append(x);
            }
        }

        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
