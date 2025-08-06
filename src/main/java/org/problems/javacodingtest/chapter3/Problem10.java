package org.problems.javacodingtest.chapter3;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] map = new int[n + 2][n + 2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int now = map[i][j];

                if (now <= map[i - 1][j]) continue;
                if (now <= map[i + 1][j]) continue;
                if (now <= map[i][j - 1]) continue;
                if (now <= map[i][j + 1]) continue;

                count++;
            }
        }

        System.out.println(count);
    }
}
