package org.problems.javacodingtest;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);

        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p=0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }
        p=1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==t) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }

        for (int x : answer) {
            System.out.print(x+" ");
        }
    }
}

/*
요약
p=0이면 “아직 t 본 적 없음”인데도 거리가 작게 나와서, 실제로 가까운 t가 반대쪽에만 있으면 고쳐지지 않는다.

충분히 큰 값(예: 1000 또는 s.length()보다 큰 수)을 초기화하면 “아직 거리 정보 없음”을 사실상 무한대로 두기 때문에 반대 방향 패스에서 제대로 된 거리로 덮어쓴다.

그래서 첫 패스와 두 번째 패스 둘 다 t를 만나기 전까지는 큰 값으로 시작해야 하고, p=0은 오직 t를 만났을 때만 써야 한다.

 * 거리 아직 모르고 최소거리는 큰값으로 시작하고, 최대거리는 작은값으로 보통 초기화하고 시작
 */