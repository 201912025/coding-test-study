package org.problems.javacodingtest.chapter9;

import java.util.Scanner;

public class Problem1 {
    static int N;
    static int[] arr;
    static int total;
    static boolean found = false;

    static void dfs(int idx, int sum) {
        if (found) return;
        if (idx == N) {
            if (sum * 2 == total) found = true;
            return;
        }
        dfs(idx + 1, sum + arr[idx]);
        dfs(idx + 1, sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        total = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        if (total % 2 == 1) {
            System.out.println("NO");
            return;
        }

        dfs(0, 0);
        System.out.println(found ? "YES" : "NO");
    }
}
