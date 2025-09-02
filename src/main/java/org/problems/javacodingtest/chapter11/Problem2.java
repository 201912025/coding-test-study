package org.problems.javacodingtest.chapter11;

import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N + 2];
        D[1] = 1;
        D[2] = 2;

        for (int i = 3; i <= N+1; i++) {
            D[i] = D[i - 1] + D[i - 2];
        }

        System.out.println(D[N+1]);
    }
}
