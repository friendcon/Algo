package ch03;

import java.io.*;
import java.util.StringTokenizer;

public class Algo15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tok;

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i<num; i++){
            tok = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tok.nextToken());
            int b = Integer.parseInt(tok.nextToken());
            wr.write(a+b + "\n");
        }
        wr.flush();
        wr.close();
    }
}
