package org.problems.javacodingtest.chapter9;

import java.util.Scanner;

public class Problem3 {
    static int N;
    static int M;
    static int[] arr1;
    static int[] arr2;
    static int max = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr1 = new int[N];
        arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }

        dfs(0, 0, 0);

        System.out.println(max);

    }

    private static void dfs(int depth, int timeSum, int result) {
        if (timeSum > M) {
            return;
        }

        if (result > max) {
            max = result;
        }

        if (depth == N) {
            max = Math.max(max, result);
            return;
        }

        dfs(depth + 1, timeSum + arr2[depth], result + arr1[depth]);
        dfs(depth + 1, timeSum , result);
    }
}
