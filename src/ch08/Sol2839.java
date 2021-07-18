package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int X = 0;
        int Y = 0;
        int total = 0;
        while (true){
            if(N % 5 == 0){
                System.out.println(N/5 + total);
                break;
            } else if(N < 0){
                System.out.println("-1");
                break;
            }
            N = N - 3; // 3kg 추가
            total++;
        }
    }
}
