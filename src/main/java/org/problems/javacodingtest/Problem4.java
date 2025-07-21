package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strs = str.split(" ");

        int max = 0;
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > max) {
                result = strs[i];
                max = strs[i].length();
            }
        }

        System.out.println(result);
    }
}
