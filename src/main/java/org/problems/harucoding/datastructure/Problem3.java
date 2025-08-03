package org.problems.harucoding.datastructure;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] prefix = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < M; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            if (i > j) {
                int tmp = i;
                i = j;
                j = tmp;
            }
            long sum = prefix[j] - prefix[i - 1];
            sb.append(sum).append('\n');
        }

        System.out.print(sb);
        sc.close();
    }
}