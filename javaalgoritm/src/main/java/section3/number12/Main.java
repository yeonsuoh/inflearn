package section3.number12;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt(); // 학생 수
        int M = kb.nextInt(); // 테스트 수
        int[][] testResults = new int[M + 1][N + 1];

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                testResults[i][j] = kb.nextInt();
            }
        }

        int result = countMentoringPairs(N, M, testResults);
        System.out.println(result);

    }

    public static int countMentoringPairs(int N, int M, int[][] testResults) {
        int count = 0;


        // 모든 멘토, 멘티 조합 확인
        for (int mentor = 1; mentor <= N; mentor++) {
            for (int mentee = 1; mentee <= N; mentee++) {
                if (mentor == mentee) continue;
                int mentorMenteeCount = 0;

                // 예: (1,2)
                for (int test = 1; test <= M; test++) {
                    // 1이 몇등인지
                    // 2가 몇등인지 찾아야 함
                    int mentorIndex = 0;
                    int menteeIndex = 0;

                    for (int index = 1; index <= N; index++) {

                        if (testResults[test][index] == mentor) {
                            mentorIndex = index;
                        }
                        if (testResults[test][index] == mentee) {
                            menteeIndex = index;
                        }
                    }
                    if (mentorIndex < menteeIndex) mentorMenteeCount++;
                }
                if (mentorMenteeCount == M) {
                    count++;
                }
            }
        }
        return count;
    }
}