package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i=0; i<n; i++) {
            strs[i] = sc.next();
        }

        char temp;
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            for (int j = 0; j < chars.length / 2; j++) {
                temp = chars[j];
                chars[j] = chars[chars.length-j-1];
                chars[chars.length-j-1] = temp;
            }
            strs[i] = new String(chars);
        }
        for (String s : strs) {
            System.out.println(s);
        }
    }
}

/*
1. char[] → String 변환이 잘못됨
strs[i] = chars.toString();
chars.toString() 은 char[] 객체의 아이덴티티(hashcode) 같은 걸 찍어주는 메서드라, [C@3b9a45b3 같은 결과가 나옵니다.
→ 올바른 변환은 strs[i] = new String(chars);
 */