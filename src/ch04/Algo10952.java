package ch04;

import java.io.*;

public class Algo10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true){
            String str[] = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            if(A == 0 && B == 0){
                break;
            }
            wr.write( A+B + "\n");
        }
        wr.flush();
        wr.close();
    }
}
