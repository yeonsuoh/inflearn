package section3.number9;

import java.util.Scanner;

/**
 * 9. 격자판 최대합
 * 설명
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 *
 * Image1.jpg
 *
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 *
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 *
 * 출력
 * 최대합을 출력합니다.
 *
 *
 * 예시 입력 1
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 * 예시 출력 1
 * 155
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        // 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // 행 계산
        int max = 0;
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
                if (sum > max ){
                    max = sum;
                }
            }
        }

        // 열 계산
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
                if (sum > max ){
                    max = sum;
                }
            }
        }

        // 대각선 계산
        // 00 11 22 33 44
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            if (sum > max ){
                max = sum;
            }
        }

        // 대각선 계산
        // 04 13 22 31 40
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][n-1-i];
            if (sum > max ){
                max = sum;
            }
        }

        System.out.println(max);
    }
}
