package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str = br.readLine();
            StringTokenizer stz = new StringTokenizer(str);

            int A = Integer.parseInt(stz.nextToken());
            int B = Integer.parseInt(stz.nextToken());
            int C = Integer.parseInt(stz.nextToken());

            if (A == 0 && B == 0 && C == 0){
                break;
            }

            if (A*A == B*B + C*C){
                System.out.println("right");
            } else if(B*B == A*A + C*C){
                System.out.println("right");
            } else if(C*C == A*A + B*B){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
