package org.problems.javacodingtest.chapter5;

import java.util.HashMap;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String votes = sc.nextLine().trim();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : votes.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char answer = ' ';
        int max = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max=map.get(key);
                answer=key;
            }
        }
        System.out.println(answer);
    }
}