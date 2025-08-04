package org.problems.javacodingtest.chapter3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) a[i] = sc.nextInt();
        for (int i = 0; i < N; i++) b[i] = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (a[i] == b[i]) {
                sb.append("D\n");
            } else if ((a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2)) {
                sb.append("A\n");
            } else {
                sb.append("B\n");
            }
        }

        System.out.print(sb);
    }
}
