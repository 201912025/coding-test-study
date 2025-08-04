package org.problems.javacodingtest.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(sc.next()));
        }

        int sum = 1;
        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                sum++;
                max = list.get(i);
            }
        }

        System.out.println(sum);

    }
}