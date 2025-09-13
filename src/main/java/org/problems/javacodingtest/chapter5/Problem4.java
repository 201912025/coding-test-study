package org.problems.javacodingtest.chapter5;

import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int answer = 0;
        int tLength = t.length();

        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < tLength; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (sMap.equals(tMap)) {
            answer++;
        }

        for (int i = tLength; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);

            sMap.put(s.charAt(i - tLength), sMap.get(s.charAt(i - tLength)) - 1);
            if (sMap.get(s.charAt(i - tLength)) == 0) {
                sMap.remove(s.charAt(i - tLength));
            }

            if (sMap.equals(tMap)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}