package section1.number8;

import java.util.Scanner;

public class MainLecture {
    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        MainLecture mainLecture = new MainLecture();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(mainLecture.solution(str));
    }
}
