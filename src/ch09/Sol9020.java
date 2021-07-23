package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
    골드바흐 파티션 : 2보다 큰 짝수는 두 소수의 합으로 이루어져있다.

 */
public class Sol9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){

            int N = Integer.parseInt(br.readLine());
            boolean prime[] = new boolean[N+1];
            int minus = 0;

            // 0과 1은 소수아님
            prime[0] = true;
            prime[1] = true;

            // 배열에서 소수가 아닌 것 제외 시간복잡도O(n루트n)
            for (int j=2; j<=N; j++) {
                for (int k=2; k*j <= N; k++){
                    prime[j*k] = true;
                }
            }


            /*
            1. 두 소수의 차이가 가장 작은 거 해결못한ver
            partition:
            for (int j=2; j<prime.length; j++){
                for (int k=2; k<prime.length; k++){
                    if(!prime[j] && !prime[k] && j+k == N) {
                        System.out.println(j + " " + k);
                        break partition;
                    }
                }
            }
            */

            int part1 = N/2;
            int part2 = N/2;
            while (true){
                if(!prime[part1] && !prime[part2]) break;
                part1--;
                part2++;
            }
            System.out.println(part1 + " " + part2);
        }
    }
}
