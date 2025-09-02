package org.problems.javacodingtest.chapter11;

import java.util.Scanner;
import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // dp[i] : arr[i]를 마지막 원소로 하는 최장 증가 부분 수열의 길이
        int[] dp = new int[N];

        dp[0] = 1;

        // O(N^2) 시간 복잡도의 DP 풀이
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                // arr[j]가 arr[i]보다 작다면,
                // arr[i]를 arr[j]를 마지막으로 하는 LIS에 추가 가능
                if (arr[j] < arr[i]) {
                    // dp[j] + 1 (기존 LIS 길이 + arr[i])과
                    // 현재 dp[i] 값 중 더 큰 값으로 갱신
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // dp 배열의 모든 값 중 최댓값이 최종 정답
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            maxLength = Math.max(maxLength, dp[i]);
        }

        System.out.println(maxLength);
    }
}
