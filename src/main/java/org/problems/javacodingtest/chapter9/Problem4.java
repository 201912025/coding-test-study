package org.problems.javacodingtest.chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    static int N, M;
    static int[] numbers;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        numbers = new int[N+1];
        for (int i=1; i<N+1; i++) {
            numbers[i] = i;
        }

        dfs(0, new ArrayList<>());

    }

    private static void dfs(int depth, List<Integer> result) {
        if (depth == M) {
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int number : numbers) {
            result.add(number);
            dfs(depth + 1, result);
            result.remove(result.size() - 1);
        }
    }
}
