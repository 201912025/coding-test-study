package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String digits = str.replaceAll("[^0-9]", "");
        // 2) 파싱해서 자연수로 변환 (선행 0 자동 제거)
        int number = Integer.parseInt(digits);

        System.out.println(number);
    }
}