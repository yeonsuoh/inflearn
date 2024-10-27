package section3.number5;

import java.util.Scanner;

/**
 * 5. 소수(에라토스테네스 체)
 * 설명
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * <p>
 * <p>
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * <p>
 * <p>
 * 출력
 * 첫 줄에 소수의 개수를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * 20
 * 예시 출력 1
 * 8
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        boolean[] isPrime = new boolean[n + 1];
        // 초기화
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(Double.valueOf(n)); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= isPrime.length - 1; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (boolean b : isPrime) {
            if (b) count++;
        }
        System.out.println(count);
    }
}
