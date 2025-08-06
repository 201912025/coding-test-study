package org.problems.javacodingtest.chapter3;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] students = new int[N][5];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                students[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                for (int k = 0; k < 5; k++) {
                    if (students[i][k] == students[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i;
            }
        }

        System.out.println(answer + 1);
    }
}
