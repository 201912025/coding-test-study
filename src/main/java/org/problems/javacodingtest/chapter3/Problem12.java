package org.problems.javacodingtest.chapter3;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] scores = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                scores[i][j] = sc.nextInt();
            }
        }

        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                boolean isValid = true;
                int temp = scores[j][i];
                for (int k = 0; k < N; k++) {
                    if (i == k) continue;
                    if (temp > scores[j][k]) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) answer++;
            }
        }

        System.out.println(answer);
    }
}