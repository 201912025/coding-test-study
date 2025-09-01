package org.problems.javacodingtest.chapter10;

import java.util.Scanner;

public class Problem6 {
    static int N;
    static int M;
    static int[] parent;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        parent = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            union(first, second);
        }

        int first = sc.nextInt();
        int second = sc.nextInt();

        check(first, second);
    }

    private static void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa != pb) {
            parent[pb] = pa;
        }
    }

    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    private static void check(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

}
