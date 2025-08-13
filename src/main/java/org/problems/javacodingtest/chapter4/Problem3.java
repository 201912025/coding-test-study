package org.problems.javacodingtest.chapter4;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] sales = new int[N];
        int max = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            sales[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < K; i++) {
            max += sales[i];
            count += sales[i];
        }

        for (int i = 1; i < N + 1 - K; i++) {
            count = count - sales[i - 1] + sales[i + K - 1];
            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
