package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        String answer = "YES";

        for (int i=0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                answer = "NO";
            }
        }
        System.out.println(answer);
    }
}

/*
public String solution(String str){
		String answer="NO";
		String tmp=new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
 */