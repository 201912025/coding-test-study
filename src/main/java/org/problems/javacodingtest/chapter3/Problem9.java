package org.problems.javacodingtest.chapter3;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int answer = Integer.MIN_VALUE;

        // 행과 열의 합 비교
        for (int i = 0; i < n; i++) {
            int sumRow = 0;
            int sumCol = 0;
            for (int j = 0; j < n; j++) {
                sumRow += arr[i][j]; // 행 합
                sumCol += arr[j][i]; // 열 합
            }
            answer = Math.max(answer, sumRow);
            answer = Math.max(answer, sumCol);
        }

        // 두 대각선 합 비교
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sumDiag1 += arr[i][i];           // ↘ 방향 대각선
            sumDiag2 += arr[i][n - i - 1];   // ↙ 방향 대각선
        }
        answer = Math.max(answer, sumDiag1);
        answer = Math.max(answer, sumDiag2);

        System.out.println(answer);
    }
}
