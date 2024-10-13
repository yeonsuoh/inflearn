package section1.number11;

import java.util.Scanner;

public class MainLecture {
    public String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt ++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
