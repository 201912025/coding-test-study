package org.problems.javacodingtest.chapter5;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Problem5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        Set<Integer> sums = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    sums.add(cards[i] + cards[j] + cards[k]);
                }
            }
        }

        int count = 0;
        int result = -1;

        for (int sum : sums) {
            count++;
            if (count == K) {
                result = sum;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }

}
