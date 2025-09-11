package org.problems.harucoding.datastructure;

import java.util.Scanner;

public class Problem11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}

/*
아스키 코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48
*/