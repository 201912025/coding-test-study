package org.problems.javacodingtest.chapter4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;

            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }

        System.out.print(answer);
    }
}

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextInt();
        int[] inputs = new int[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = sc.nextInt();
        }

        int lt = 0;
        int rt = 0;
        int count = 0;
        long sum = inputs[0];

        while (true) {
            if (sum < M && rt != N - 1) {
                rt++;
                sum += inputs[rt];
            }
            else if (sum < M && rt == N - 1) {
                break;
            }

            else if (sum > M) {
                sum -= inputs[lt];
                lt++;
            }
            else if (sum == M) {
                count++;
                sum -= inputs[lt];
                lt++;
            }
        }

        System.out.println(count);
    }
 */
