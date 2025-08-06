package org.problems.javacodingtest.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> ints = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ints.add(sc.nextInt());
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            int point = ints.get(i);
            for (int j = 0; j < N; j++) {
                if (ints.get(j) > point) {
                    rank ++;
                }
            }
            answers.add(rank);
        }

        for (int x : answers) {
            System.out.print(x + " ");
        }

    }
}
