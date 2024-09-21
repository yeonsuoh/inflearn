package section1.number2;

import java.util.Scanner;

// 강의 들으며 정리
public class MainLecture {
    // 프로그래머스 방식
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()){
//            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
            // 아스키넘버 대문자 : 65~90
            // 아스키넘버 소문자: 96~122
            // 차이 : 32
            if (x >= 97 && x <= 122) answer += (char)(x-32);
            else answer += (char)(x+32);
        }
        return answer;
    }



    public static void main(String[] args) {
     MainLecture T = new MainLecture();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
