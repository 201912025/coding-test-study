package org.problems.javacodingtest.chapter5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());

        for (int i = 1; i <= N - K; i++) {
            map.put(arr[i - 1], map.get(arr[i - 1]) - 1);
            if (map.get(arr[i - 1]) == 0) {
                map.remove(arr[i - 1]);
            }
            map.put(arr[i+K-1], map.getOrDefault(arr[i+K-1], 0) + 1);
            answer.add(map.size());
        }

        for (int x : answer){
            System.out.print(x + " ");
        }
    }
}
