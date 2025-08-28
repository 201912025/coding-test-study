package org.problems.javacodingtest.chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 피로연에 참석할 인원수 N을 입력받습니다.
        int n = scanner.nextInt();

        // 2. 이벤트를 저장할 리스트를 생성합니다. 각 이벤트는 시간과 타입을 가집니다.
        // int[]는 {시간, 타입} 형태이며, 타입은 +1(도착), -1(출발)입니다.
        List<int[]> events = new ArrayList<>();

        // 3. N명의 친구에 대해 도착 시간과 출발 시간을 입력받고 이벤트 리스트에 추가합니다.
        for (int i = 0; i < n; i++) {
            int arrival = scanner.nextInt();
            int departure = scanner.nextInt();

            events.add(new int[]{arrival, 1});
            events.add(new int[]{departure, -1});
        }

        scanner.close();

        // 4. 이벤트 목록을 시간 순으로 정렬합니다.
        // 시간이 같을 경우, 문제 조건에 따라 '출발(-1)'을 '도착(+1)'보다 먼저 처리하도록 정렬합니다.
        Collections.sort(events, (a, b) -> {
            if (a[0] == b[0]) {
                // 시간이 같으면 타입(a[1], b[1])을 기준으로 오름차순 정렬 (-1이 +1보다 작으므로)
                return a[1] - b[1];
            }
            // 시간이 다르면 시간을 기준으로 오름차순 정렬
            return a[0] - b[0];
        });

        // 5. 정렬된 이벤트 목록을 순회하며 최대 인원을 계산합니다.
        int currentPeople = 0;
        int maxPeople = 0;

        for (int[] event : events) {
            currentPeople += event[1];
            if (currentPeople > maxPeople) {
                maxPeople = currentPeople;
            }
        }

        // 6. 계산된 최대 인원수를 출력합니다.
        System.out.println(maxPeople);
    }
}
