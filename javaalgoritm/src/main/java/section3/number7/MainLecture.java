package section3.number7;

import java.util.Scanner;

public class MainLecture {
    int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt ++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MainLecture mainLecture = new MainLecture();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(mainLecture.solution(n, arr));
    }
}
