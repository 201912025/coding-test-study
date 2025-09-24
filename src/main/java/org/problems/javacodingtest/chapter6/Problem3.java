package org.problems.javacodingtest.chapter6;

import java.util.Scanner;
import java.util.Stack;

public class Problem3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [][] board = new int [N][N];

        for (int i =0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int M = sc.nextInt();
        int [] moves = new int [M];
        for (int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }

        int count = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            int doll = -1;
            for (int i = 0; i< N; i++) {
                int pick = board[i][move-1];
                if (pick !=0) {
                    doll = pick;
                    board[i][move-1] = 0;
                    break;
                }
            }

            if (doll == -1) continue;

            if(stack.empty()) {
                stack.push(doll);
            }
            else if (!stack.empty()) {
                if (stack.peek() == doll) {
                    count += 2;
                    stack.pop();
                }
                else if (stack.peek() != doll) {
                    stack.push(doll);
                }
            }
        }

        System.out.println(count);
    }
}
