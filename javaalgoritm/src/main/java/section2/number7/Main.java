package section2.number7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char[] charArr = s.toLowerCase().toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (charArr[i] != charArr[s.length() -1 - i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
