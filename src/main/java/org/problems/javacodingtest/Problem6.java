package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == i) {
                answer.append(c);
            }
        }

        System.out.println(answer.toString());
    }
}

/*
str.indexOf(c)는 문자열 str에서 문자 c가 처음 등장하는 위치를 반환합니다.

반복문 인덱스 i가 그 위치와 같다는 것은, 지금 보고 있는 문자가 첫등장 시점이라는 뜻이므로 answer에 추가합니다.

이렇게 하면 최초 한 번만 남고 이후 중복된 문자는 모두 제외됩니다.
 */