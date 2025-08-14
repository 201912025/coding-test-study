package org.problems.javacodingtest.chapter5;

import java.util.HashMap;
import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char key : str1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (char key : str2.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) - 1);
        }

        String answer = "YES";
        for (char key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = "NO";
            }
        }

        System.out.println(answer);
    }
}
