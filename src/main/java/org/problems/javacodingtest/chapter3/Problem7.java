package org.problems.javacodingtest.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> inputs = new ArrayList<>();
        int sum = 0;
        List<Integer> score = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            inputs.add(sc.nextInt());
        }

        for (int i = 0; i < N; i++) {
            if (inputs.get(i) == 0) {
                sum = 0;
                score.add(sum);
            }
            if (inputs.get(i) == 1) {
                sum++;
                score.add(sum);
            }
        }
            int result = 0;
            for (int x : score) {
                result += x;
            }

            System.out.println(result);
        }
    }
