package section1.number3;

import java.util.Scanner;

public class MainLecture {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }
        // 다른 방법 : substring, index 사용
        int pos;
        while((pos=str.indexOf(" ")) != -1 ) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
            if (str.length() > m) answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
