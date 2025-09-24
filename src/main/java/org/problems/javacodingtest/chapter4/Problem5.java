package org.problems.javacodingtest.chapter4;

import java.util.Scanner;

public class Problem5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int sum = 0;
        int lt = 1;

        for (int rt = 1; rt <= N; rt++) {
            sum += rt;
            if (sum == N) {
                count++;
            }
            while (sum >= N) {
                sum -= lt;
                lt++;
                if (sum == N) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
