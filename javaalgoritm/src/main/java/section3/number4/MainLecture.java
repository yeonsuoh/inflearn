package section3.number4;

import java.util.Scanner;

public class MainLecture {
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public void solution2(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        MainLecture mainLecture = new MainLecture();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int x: mainLecture.solution(n)) {
            System.out.print(x + " ");
        }
    }
}
