package org.problems.javacodingtest.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(1);
        ints.add(2);

        for (int i = 2; i < N - 1; i++) {
            ints.add(ints.get(i) + ints.get(i - 1));
        }

        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}