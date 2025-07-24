package org.problems.javacodingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        List<String> strings = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        str = str.replace('#', '1').replace('*', '0');

        for (int i = 0; i < str.length(); i+=7) {
            strings.add(str.substring(i, i + 7));
        }

        for (int i = 0; i < strings.size(); i++) {
            String tmp = strings.get(i);
            int sum = 0;
            for (int j = 0; j < tmp.length(); j++) {
                char ch = tmp.charAt(j);
                int number = ch - '0';
                sum += number * ((int) Math.pow(2, tmp.length() - j - 1));
            }
            sb.append((char) sum);
        }

        System.out.println(sb);
    }
}