package org.problems.javacodingtest.chapter9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem11 {
    static int[][] inputs = new int[7][7];
    static boolean[][] visited = new boolean[7][7];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int level = 0; // 공통 변수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        int result = bfs();
        System.out.print(result);
    }

    private static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0}); // 출발점
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];

                if (x == 6 && y == 6) {
                    return level; // 도착 시 현재 레벨 = 최단 거리
                }

                for (int j = 0; j < 4; j++) {
                    int nextx = x + dx[j];
                    int nexty = y + dy[j];

                    if (nextx < 0 || nexty < 0 || nextx > 6 || nexty > 6) continue;
                    if (visited[nextx][nexty]) continue;
                    if (inputs[nextx][nexty] == 1) continue;

                    visited[nextx][nexty] = true;
                    q.offer(new int[]{nextx, nexty});
                }
            }
        }
        level++;

        return -1; // 도달 불가
    }
}
