package section3.number5;

import java.util.Scanner;

public class MainLecture {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer ++;
                for (int j = i; j <= n; j = j  +i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        MainLecture mainLecture = new MainLecture();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(mainLecture.solution(n));
    }
}
