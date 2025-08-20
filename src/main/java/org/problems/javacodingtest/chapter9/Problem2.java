package org.problems.javacodingtest.chapter9;

import java.util.Scanner;

public class Problem2 {
    static int Max = 0;
    static int c;
    static int N;
    static int[] weights;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        N = sc.nextInt();
        weights = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
        }

        dfs(0, 0);

        System.out.print(Max);

    }

    private static void dfs(int depth, int sum) {

        if (sum > c) {
            return;
        }

        if (depth == N) {
            Max = Math.max(Max, sum);
            return;
        }

        dfs(depth+1, sum + weights[depth]);

        dfs(depth + 1, sum);
    }
}
