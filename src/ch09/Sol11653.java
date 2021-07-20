package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i=2;
        while (N >= i){
            if(N%i == 0){
                System.out.println(i);
                N = N/i;
            } else {
                i++;
            }
        }
    }
}
