package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sol2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 이차원 배열 선언 필요 ( 0층 ~ 14층 )
        int apt[][] = new int[15][15];
        int T = Integer.parseInt(br.readLine()); // 테스트케이스

        // apt[0][0] ~ [0][15] 초기화
        for (int i=1; i<apt.length; i++){
            apt[0][i] = i; // 0층 모든 호실 인원수 초기화
            apt[i][1] = 1; // 모든층 1호 1로 초기화
        }

        for(int i=0; i<T; i++){
            int K = Integer.parseInt(br.readLine()); // 층
            int N = Integer.parseInt(br.readLine()); // 호

            for (int j=1; j<apt.length; j++){
                for (int k=2; k<apt.length; k++){
                    apt[j][k] = apt[j][k-1] + apt[j-1][k];
                }
            }
            System.out.println(apt[K][N]);
        }

    }
}
