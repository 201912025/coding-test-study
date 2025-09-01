package org.problems.javacodingtest.chapter9;

import java.util.Scanner;

public class Problem13 {

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    static int n; // 지도의 크기
    static int[][] board; // 지도 격자판

    public static void dfs(int x, int y) {
        // 현재 위치를 바다(0)로 만들어 방문했음을 표시
        board[x][y] = 0;

        // 8개 방향에 대해 다음 갈 곳을 탐색
        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            // 다음 좌표가 지도 범위 안에 있고, 아직 방문하지 않은 육지(1)일 경우
            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && board[nextX][nextY] == 1) {
                // 재귀 호출로 탐색을 계속 진행
                dfs(nextX, nextY);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];

        // 지도 정보 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int islandCount = 0;
        // 지도의 모든 좌표를 처음부터 순회
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 만약 육지(1)를 발견하면, 새로운 섬의 시작점임
                if (board[i][j] == 1) {
                    islandCount++; // 섬 개수 1 증가
                    dfs(i, j);     // 이 섬과 연결된 모든 육지를 0으로 바꿈
                }
            }
        }

        System.out.println(islandCount);
        sc.close();
    }
}