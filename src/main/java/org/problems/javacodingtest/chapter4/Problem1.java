package org.problems.javacodingtest.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> answers = new ArrayList<>();
        int lt = 0;
        int rt = 0;

        while (lt != N && rt != M) {
            if (arr1[lt] < arr2[rt]) {
                answers.add(arr1[lt]);
                lt++;
            }
            else if (arr1[lt] > arr2[rt]) {
                answers.add(arr2[rt]);
                rt++;
            }
            else {
                answers.add(arr1[lt]);
                answers.add(arr2[rt]);
                lt++;
                rt++;
            }
    }
        if (lt == N) {
            for (int i = rt; i < M; i++) {
                answers.add(arr2[i]);
            }
        }
        if (rt == M) {
            for (int i = lt; i < N; i++) {
                answers.add(arr1[i]);
            }
        }

        for (int x : answers) {
            System.out.print(x + " ");
        }
    }
}