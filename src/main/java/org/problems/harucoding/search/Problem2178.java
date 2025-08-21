package org.problems.harucoding.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2178 {
    static int N, M;
    static int[][] A;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) A[i][j] = line.charAt(j) - '0';
        }

        System.out.println(bfsLevel(0, 0));
    }

    // 맵 값을 건드리지 않는 레벨 기반 BFS (시작칸=1로 세기)
    static int bfsLevel(int sx, int sy) {
        if (A[sx][sy] == 0) return -1;          // 시작이 벽이면 실패

        Queue<int[]> q = new LinkedList<>();
        visited[sx][sy] = true;
        q.offer(new int[]{sx, sy});

        int dist = 1;                            // 현재 레벨(칸 수)
        while (!q.isEmpty()) {
            int sz = q.size();                   // 현재 레벨의 노드 수
            for (int t = 0; t < sz; t++) {
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];

                if (x == N - 1 && y == M - 1) return dist; // 최초 도착 = 최단 칸 수

                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d], ny = y + dy[d];
                    if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue; // 범위
                    if (visited[nx][ny]) continue;                        // 중복
                    if (A[nx][ny] == 0) continue;                         // 벽

                    visited[nx][ny] = true;                               // 큐에 넣을 때 방문 처리
                    q.offer(new int[]{nx, ny});
                }
            }
            dist++;                                                       // 한 레벨 끝 → 거리 +1
        }
        return -1;                                                        // 도달 불가
    }
}

/* public class Main {
    static int N, M;
    static int[][] A;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N][M];
        visited = new boolean[N][M];

        // 맵 입력
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                A[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(BFS(0, 0));
    }

    private static int BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            // 도착지에 도달했을 때 거리 반환
            if (x == N - 1 && y == M - 1) return A[x][y];

            for (int k = 0; k < 4; k++) { // 상하좌우 탐색
                int nx = x + dx[k];
                int ny = y + dy[k];

                // 범위 검사
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                // 벽(0) 이거나 이미 방문한 곳 패스
                if (A[nx][ny] == 0 || visited[nx][ny]) continue;

                // 방문 처리
                visited[nx][ny] = true;

                // 거리 = 현재 칸의 거리 + 1
                A[nx][ny] = A[x][y] + 1;

                // 큐에 삽입
                queue.offer(new int[]{nx, ny});
            }
        }

        return -1; // 도달 불가
    }
} */
