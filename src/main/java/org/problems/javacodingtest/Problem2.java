package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars= str.toCharArray();

        for (int i=0; i< chars.length; i++) {
            if (Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }
            else chars[i] = Character.toUpperCase(chars[i]);
        }
        String s = new String(chars);
        System.out.println(s);
    }
}
