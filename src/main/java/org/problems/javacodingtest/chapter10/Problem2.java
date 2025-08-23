package org.problems.javacodingtest.chapter10;

import java.util.*;

class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<int[]> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetings.add(new int[]{start, end});
        }

        // 1. 끝나는 시간을 기준으로 정렬 (끝나는 시간이 같으면 시작 시간으로 정렬)
        Collections.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int count = 0;
        int lastEndTime = 0;

        // 2. 그리디 방식으로 회의 선택
        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            // 현재 회의의 시작 시간이 이전 회의의 끝나는 시간보다 같거나 늦으면 선택
            if (start >= lastEndTime) {
                count++;
                lastEndTime = end;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
