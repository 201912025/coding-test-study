package org.problems.javacodingtest.chapter9;

import java.util.*;

public class Problem12 {
    static int[][] tomato;
    static int N;
    static int M;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int level = 0;
    static List<int[]> tomatoInfo = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        tomato = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tomato[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 1) {
                    tomatoInfo.add(new int[]{i, j});
                }
            }
        }

        boolean allRipe = true;
        boolean allUnripe = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 0) allRipe = false;
                if (tomato[i][j] == 1) allUnripe = false;
            }
        }

        if (allRipe) {
            System.out.println(0);
            return;
        } else if (allUnripe) {
            System.out.println(-1);
            return;
        }

        bfs();
    }

    private static void bfs() {
        Queue<int[]> q = new LinkedList<>();

        for (int[] t : tomatoInfo) {
            q.offer(t);
        }

        while (!q.isEmpty()) {
            boolean allRipe = true;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (tomato[i][j] == 0) {
                        allRipe = false;
                        break;
                    }
                }
            }
            if (allRipe) {
                System.out.println(level); // 모든 토마토 익었으면 레벨 출력
                return;
            }


            int size = q.size(); // 하루 단위 처리

            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];

                for (int j = 0; j < 4; j++) {
                    int nextx = x + dx[j];
                    int nexty = y + dy[j];

                    if (nextx < 0 || nexty < 0 || nextx >= N || nexty >= M) continue;
                    if (tomato[nextx][nexty] != 0) continue;

                    tomato[nextx][nexty] = 1; // 익은 토마토로 표시
                    q.offer(new int[]{nextx, nexty});
                }
            }
            level++; // 하루가 끝났으므로 레벨 증

        }

        // 다 익지 못한 경우
        System.out.println(-1);
    }
}
