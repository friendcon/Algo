package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    문제 : 두점 x1,y1 / x2,y2 거리는 T1, T2 = |X1 - X2| + |Y1 - Y2|
    원 : 평면 상의 어떤 점에서 거리가 일정한 점들의 집합
    반지름 R이 주어졌을 때 원의 넓이와 택시 기하학에서 원의 넓이를 구하는 프로그램을 작성하여라

    일반적인 원의 넓이 공식 : R*R*3.14
    택시 기하학에서 워늬 넓이 공식 : R*R*2

 */
public class Sol3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        System.out.printf("%.6f\n", (double) R * R * 3.1415926535897932384626433);
        System.out.printf("%.6f\n", (double) 2 * R * R);
    }
}
