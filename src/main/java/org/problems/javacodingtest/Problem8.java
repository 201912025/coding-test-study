package org.problems.javacodingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Character> charList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String answer = "YES";

        str = str.toLowerCase();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                charList.add(chars[i]);
            }
        }

        for (Character ch : charList) {
            sb.append(ch);
        }
        char[] newChars = sb.toString().toCharArray();


        for (int i = 0; i < newChars.length / 2; i++) {
            if (newChars[i] != newChars[newChars.length - i - 1]) {
                answer = "NO";
            }
        }

        System.out.println(answer);
    }
}