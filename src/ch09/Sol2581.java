package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;
        int total = 0; // 소수의 총 갯수
        for (int i=M; i<=N; i++){
            int count = 0;
            for (int j=1; j<=i; j++){
                if(i%j == 0) count++;
            }
            if (min == 0 && count == 2){
                min = i;
            }
            if(count == 2) {
                sum+=i;
                total++;
            }
        }
        if(total == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
