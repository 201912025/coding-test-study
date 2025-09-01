package org.problems.harucoding.search;

import java.util.Scanner;

public class Problem1717 {

    // 각 원소의 대표 노드를 저장하는 배열
    public static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 원소 개수
        int m = sc.nextInt(); // 연산의 개수

        parent = new int[n + 1];
        // 1. 대표 노드를 자기 자신으로 초기화
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        // 빠른 출력을 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // 2. M만큼 연산 반복
        for (int i = 0; i < m; i++) {
            int command = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (command == 0) {
                // 0이면 union 연산
                union(a, b);
            } else {
                // 1이면 같은 집합인지 확인 (checkSame)
                if (checkSame(a, b)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }

        // 결과 한 번에 출력
        System.out.print(sb.toString());
        sc.close();
    }

    /**
     * union 연산: 두 원소가 속한 집합을 합친다.
     */
    public static void union(int a, int b) {
        // a와 b의 대표 노드를 찾음
        int rootA = find(a);
        int rootB = find(b);

        // 대표 노드가 다를 경우, 더 작은 번호를 부모로 하여 합침
        if (rootA != rootB) {
            if (rootA < rootB) {
                parent[rootB] = rootA;
            } else {
                parent[rootA] = rootB;
            }
        }
    }

    /**
     * find 연산: 원소 a의 대표 노드를 찾는다. (경로 압축 적용)
     */
    public static int find(int a) {
        // a가 대표 노드이면 그대로 반환
        if (parent[a] == a) {
            return a;
        }
        // 아니라면, 대표 노드를 찾아 올라가면서 경로상의 노드들이 모두 루트를 직접 가리키도록 갱신 (경로 압축)
        return parent[a] = find(parent[a]);
    }

    /**
     * checkSame: 두 원소가 같은 집합인지 확인
     */
    public static boolean checkSame(int a, int b) {
        // 두 원소의 대표 노드가 같은지 비교
        return find(a) == find(b);
    }
}