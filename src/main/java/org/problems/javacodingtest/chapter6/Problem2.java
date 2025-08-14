package org.problems.javacodingtest.chapter6;

import java.util.Scanner;
import java.util.Stack;

public class Problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }
            else {
                if (stack.isEmpty()) {
                    sb.append(c);
                }
            }
        }

        System.out.print(sb);
    }
}
