package section3.number1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        arr[0] = -1;

        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i-1] < arr[i] ){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
