package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
    Math의 함수들
    - Math.abs() : 절대값을 구한다
    - Math.pow(,) : 제곱
    - Math.sqrt() : 루트값
    문제 : X1, Y1 & X2, Y2
    두사람이 계산한 거리 R1, R2가 주어졌을 때 다른사람이 있을 수 있는 좌표의 수 구해라
    원의 방정식을 구해야하나?
    1. 두 점의 교차점이 없는 경우
    - r1, r2 사이의 거리 > 반지름의 합
    - 중심이 일치하지만 반지름이 작은 경우
    2. 두 점이 만나는 경우
    - 0 < 두 점 사이의 거리 < 반지름의 합
    3. 한 점이 만나는 경우
    - 원이 외접할경우 : 두점사이의거리 = 반지름의 합
    - 원이 내접할경우 : 두점사이의 거리 = 큰원의반지름 -작은반지름
    4. 원이 일치하는 경우
 */

public class Sol1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T>0){
            String str = br.readLine();
            StringTokenizer stz = new StringTokenizer(str);
            int x1 = Integer.parseInt(stz.nextToken());
            int y1 = Integer.parseInt(stz.nextToken());
            int r1 = Integer.parseInt(stz.nextToken());
            int x2 = Integer.parseInt(stz.nextToken());
            int y2 = Integer.parseInt(stz.nextToken());
            int r2 = Integer.parseInt(stz.nextToken());

            // 두점사이의 거리
            double length = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

            if(length>Math.abs(r1-r2) && r1+r2>length){
                System.out.println(2);
            } else if (r1==r2 && x1==x2 && y1==y2){
                System.out.println(-1);
            } else if(length == r1+r2 || Math.abs(r2-r1) == length){
                System.out.println(1);
            } else if(r1+r2 < length || length == 0 || Math.abs(r2-r1) > length){
                System.out.println(0);
            }
            T--;
        }
    }
}
