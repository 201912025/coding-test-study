package org.problems.harucoding.search;

import java.util.Scanner;

public class Problem1717 {
    static int N;
    static int M;
    static int [] arr;

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        N= sc.nextInt();
        M= sc.nextInt();
        arr = new int[N+1];

        for (int i =0; i<N+1; i++) {
            arr[i] = i;
        }

        for (int i=0; i<M; i++) {
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(x == 0) union(a, b);
            else if(x == 1) checkSame(a, b);
        }
    }

    private static void union(int a, int b) {
        int nodeA = find(a);
        int nodeB = find(b);
        if(nodeA == nodeB) {
            return;
        }
        arr[nodeB] = nodeA;
    }

    private static int find(int x) {
        if (x == arr[x]) {
            return x;
        }

        return arr[x] = find(arr[x]);
    }

    private static void checkSame(int a, int b) {
        int nodeA = find(a);
        int nodeB = find(b);
        if (nodeA == nodeB) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

}