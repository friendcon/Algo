package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 0;
        while (true){
            N = Integer.parseInt(br.readLine());
            int count = 0;
            if(N == 0) break;
            boolean prime[] = new boolean[2*N+1];
            prime[0] = true;
            prime[1] = true;
            for(int i=2; i<=2*N; i++){
                for(int j=2; j*i<=2*N; j++){
                    prime[i*j] = true;
                }
            }
            for(int i=N+1; i<prime.length ; i++){
                if(prime[i] == false) count++;
            }
            System.out.println(count);
        }


    }
}
