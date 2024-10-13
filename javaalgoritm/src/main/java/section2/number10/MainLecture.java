package section2.number10;

import java.util.Scanner;

public class MainLecture {
    public int[] solution (String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >=0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(p, answer[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainLecture mainLecture = new MainLecture();
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        char c = keyboard.next().charAt(0);
        for (int x : mainLecture.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
