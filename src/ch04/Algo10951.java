package ch04;

import java.io.*;
import java.util.StringTokenizer;

public class Algo10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        StringTokenizer tok;
        while ( (str = br.readLine()) != null){
            tok = new StringTokenizer(str, " ");
            int A = Integer.parseInt(tok.nextToken());
            int B = Integer.parseInt(tok.nextToken());
            wr.write(A+B + "\n");
        }
        wr.flush();
        wr.close();
    }
}
