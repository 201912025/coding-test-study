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


/*
- 각 자연수 뒤집은 수가 소수이면 각소수 출력
- 첫자리 0은 무시


32 55 62 20 370 200 30 100
23 55 26 2  73  2   3  1

1이면 소수
   1 2 3 4 5 6 7
[1 1 1 1 0 1 0 1]

7일 때 1제외 7로만 나눠져야 함 -> 하나라도 나눠지면 소수 x


1. 정수형 배열돌면서 뒤집고 소수면 바로 출력
2. 2부터 N-1까지 돌면서 하나라도 나눠지면 소수 X
3. 소수면 출력 아니면 출력 X


int [] inputs = new int [N];
inputs 입력

List<Integer> reversed new
for (int input : inputs) {
    reversed.add(new StringBuilder(input.toString(input)).reverse().toString())
}

for (int x : reversed) {
    for (int i=2; i*i <= x i++) {
        if(x % i == 0) re
    }
}














 */