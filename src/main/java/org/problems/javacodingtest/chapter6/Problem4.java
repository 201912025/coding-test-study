package org.problems.javacodingtest.chapter6;

import java.util.*;

public class Problem4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);

        int L = b.length() - 1;
        HashMap<Character, Integer> am = new HashMap<>();
        for (int i = 0; i < L && i < a.length(); i++) {
            char ch = a.charAt(i);
            am.put(ch, am.getOrDefault(ch, 0) + 1);
        }

        int lt = 0;
        int answer = 0;
        for (int rt = L; rt < a.length(); rt++) {
            char add = a.charAt(rt);
            am.put(add, am.getOrDefault(add, 0) + 1);
            if (am.equals(bm)) answer++;

            char rem = a.charAt(lt++);
            am.put(rem, am.get(rem) - 1);
            if (am.get(rem) == 0) am.remove(rem);
        }

        System.out.print(answer);
    }
}
