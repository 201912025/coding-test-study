package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        int sum = 1;
        char tmp = ' ';
        int length = str.length();

        for (int i = 0; i < length - 1; i++) {
            tmp = str.charAt(i);
            if (str.charAt(i) == str.charAt(i + 1)) {
                sum++;
            }
            if (str.charAt(i) != str.charAt(i + 1) & sum == 1) {
                sb.append(tmp);
            }
            if (str.charAt(i) != str.charAt(i + 1) & sum != 1) {
                sb.append(tmp);
                sb.append(sum);
                sum = 1;
            }
        }

        if (str.charAt(length - 1) != str.charAt(length - 2)) {
            sb.append(str.charAt(length - 1));
        }
        if (str.charAt(length - 1) == str.charAt(length - 2)) {
            sb.append(tmp);
            sb.append(sum);
        }

        System.out.println(sb);
    }
}

/*
if (str.charAt(i) != str.charAt(i + 1)) {
    sb.append(tmp);
    if (sum > 1) {
        sb.append(sum);
    }
    sum = 1;
}
 */