package org.problems.javacodingtest.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            strings.add(sc.next());
        }

        List<Integer> reversed = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String temp = new StringBuilder(strings.get(i)).reverse().toString();
            reversed.add(Integer.parseInt(temp));
        }

        for (int i = N - 1; i >= 0; i--) {
            int num = reversed.get(i);
            if (num == 1) {
                reversed.remove(i);
                continue;
            }
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    reversed.remove(i);
                    break;
                }
            }
        }

        for (int x : reversed) {
            System.out.print(x + " ");
        }
    }
}