package section3.number11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 학생 수
        int[][] arr = new int[6][n + 1];
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int count;
        int max = 0;
        int ans = 0;
        for (int i = 1; i < 6; i++) { // 1번학생
            count = 0; // 초기화
            for (int j = 1; j < n + 1; j++) {
                for (int k = 1; k < 6; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
