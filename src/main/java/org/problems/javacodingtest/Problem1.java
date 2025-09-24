package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char letter = sc.next().charAt(0);
        letter = Character.toLowerCase(letter);
        str = str.toLowerCase();

        int sum = 0;
        for (char x : str.toCharArray()) {
            if (x==letter) sum++;
        }

        System.out.println(sum);
    }
}
