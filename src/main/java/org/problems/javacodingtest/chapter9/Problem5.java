package org.problems.javacodingtest.chapter9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem5 {
    static int[] coins;    // 동전 배열을 static으로 선언
    static int target;     // 목표 금액도 static으로 선언

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 동전 종류 개수
        coins = new int[n];
        for (int i = 0; i < n; i++) coins[i] = sc.nextInt();
        target = sc.nextInt(); // 목표 금액

        System.out.println(bfs()); // 파라미터 없이 호출 가능
    }

    static int bfs() {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[target + 1];

        q.offer(0);
        visited[0] = true;
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int now = q.poll();
                if (now == target) return level; // 목표 금액 도달하면 반환
                for (int coin : coins) {
                    int next = now + coin;
                    if (next <= target && !visited[next]) {
                        visited[next] = true;
                        q.offer(next);
                    }
                }
            }
            level++;
        }
        return -1; // 불가능한 경우
    }
}
