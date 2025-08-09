package org.problems.javacodingtest.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
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

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> answers = new ArrayList<>();
        int lt = 0;
        int rt = 0;

        while (lt != N && rt != M) {
            if (arr1[lt] < arr2[rt]) lt++;
            else if (arr1[lt] > arr2[rt]) rt++;
            else {
                answers.add(arr1[lt]);
                lt++;
                rt++;
            }
        }

        for (int x : answers) {
            System.out.print(x + " ");
        }
    }
}