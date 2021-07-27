package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    문제 : 직사각형 좌표 3개를 입력하면 나머지 한개의 좌표를 출력하라
    x좌표가 같고 y가 다른 좌표 2개 / x가 다르고 y가 같은 좌표 2개
*/

public class Sol3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int xy[][] = new int[3][2];
        int x = 0, y = 0;

        for (int i=0; i<3; i++){
            String str = br.readLine();
            StringTokenizer stz = new StringTokenizer(str);
            xy[i][0] = Integer.parseInt(stz.nextToken());
            xy[i][1] = Integer.parseInt(stz.nextToken());
        }

        // x 좌표
        if (xy[0][0] == xy[1][0]) {
            x = xy[2][0];
        } else if (xy[0][0] == xy[2][0]){
            x = xy[1][0];
        } else if(xy[1][0] == xy[2][0]){
            x = xy[0][0];
        }

        // y 좌표
        if (xy[0][1] == xy[1][1]) {
            y = xy[2][1];
        } else if (xy[0][1] == xy[2][1]){
            y = xy[1][1];
        } else if(xy[1][1] == xy[2][1]){
            y = xy[0][1];
        }
        System.out.println(x + " " + y);
    }
}
