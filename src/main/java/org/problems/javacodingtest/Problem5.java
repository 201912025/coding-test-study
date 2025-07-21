package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        String answer;
        char[] s=str.toCharArray();
        int lt=0, rt=str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        System.out.println(answer);
    }
}


/*
1. for-i 루프는 고정된 짝대칭 인덱스만 보고,
중간에 특수문자가 섞이면 뒤집기 매칭이 깨짐

2. while-투포인터는
- 왼쪽이 특수면 왼쪽만 이동
- 오른쪽이 특수면 오른쪽만 이동
- 둘 다 알파벳일 때만 swap → 정확히 알파벳끼리 뒤집힘
 */