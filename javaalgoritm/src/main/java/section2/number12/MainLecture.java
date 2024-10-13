package section2.number12;

import java.util.Scanner;

public class MainLecture {
    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7)
                    .replace('#', '1')
                    .replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        MainLecture mainLecture = new MainLecture();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(mainLecture.solution(n, str));
    }
}

