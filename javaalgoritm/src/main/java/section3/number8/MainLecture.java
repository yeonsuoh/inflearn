package section3.number8;

import java.util.Scanner;

public class MainLecture {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0 ; j < n; j++) {
                if (arr[j] > arr[i]) cnt++;
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
        for (int x : mainLecture.solution(n, arr)) {
            System.out.println(x + " ");
        }
    }
}
