package section3.number4;

import java.util.Scanner;

/**
 * 4. 피보나치 수열
 * 설명
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * 입력
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 *
 * 출력
 * 첫 줄에 피보나치 수열을 출력합니다.
 *
 * 예시 입력 1
 * 10
 * 예시 출력 1
 * 1 1 2 3 5 8 13 21 34 55
 */
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 3부터 45까지
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int x = 2; x < n; x++) {
            arr[x] = arr[x-2] + arr[x-1];
        }
        for (int y = 0; y < n; y++) {
            System.out.print(arr[y] + " ");
        }
    }
}
