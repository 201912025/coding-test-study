package org.problems.javacodingtest.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();

        List<Integer> ints = new ArrayList<>();
        List<Integer> arrays = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ints.add(sc.nextInt());
        }

        arrays.add(ints.get(0));

        for (int i = 1; i <= N - 1; i++) {
            if (ints.get(i) > ints.get(i-1)) {
                arrays.add(ints.get(i));
            }
        }

        for (int x : arrays) {
            System.out.print(x + " ");
        }
    }
}