package org.problems.javacodingtest.chapter9;

import java.util.Scanner;

public class Problem10 {
    static int[][] inputs = new int[7][7];
    static boolean[][] visited = new boolean[7][7];
    static int[] dx = new int[] {-1, 1, 0, 0};
    static int[] dy = new int[] {0, 0, -1, 1};
    static int count = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                inputs[i][j] = sc.nextInt();
            }
        }

        visited[0][0] = true;
        dfs(0,0);

        System.out.print(count);
    }

    private static void dfs(int x, int y) {
        if (x == 6 && y == 6) {
            count ++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nextx = x + dx[i];
            int nexty = y + dy[i];
            if (nextx < 0 || nexty < 0 || nextx > 6 || nexty > 6) continue;
            if (visited[nextx][nexty]) continue;
            if (inputs[nextx][nexty] == 1) continue;

            visited[nextx][nexty] = true;
            dfs(nextx, nexty);
            visited[nextx][nexty] = false;
        }
    }
}