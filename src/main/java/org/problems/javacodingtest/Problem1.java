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
- 1부터 100사이의 자연수가 적힌 N장의 카드
- 같은 숫자 카드 여러장 가능
- 이중 3장을 뽑아 각 카드 적힌수 합한값 모든 경우 기록(중복제거) -> Set 기록
- 이중 K 번째로 큰수 출력



13 15 34 23 45 65 33 11 26 42


1. 3중 반복문으로 돌린후 set으로 중복제거후 기록
2.


int N , int K 입력
int [] cards = new int [N];

for (int i = 0; i < N; i++) {
    cards[i] = sc.nextInt();
}
Set<Integer> sums = new TreeSet<>(Collect);

for (int i = 0; i < N; i++) {
    for (int j = i+1; j < N; j++) {
        for (int K = j+1 ; k < N K++) {
            sums.add(cards[i] + cards[j] +
        }
    }
}

int count = 0;
int result = -1;

for (int sum : sums) {
    count++;
    if (count ==k {
        result = sum
        break;
    }
}




















 */