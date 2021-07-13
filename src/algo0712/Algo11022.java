package algo0712;

import java.io.*;
import java.util.StringTokenizer;

public class Algo11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer tok;
        for (int i=1; i<=T; i++){
            String str = br.readLine();
            tok = new StringTokenizer(str);
            int A = Integer.parseInt(tok.nextToken());
            int B = Integer.parseInt(tok.nextToken());
            int C = A+B;
            wr.write("Case #" + i + ": " + A +" + " + B + " = " + C+"\n");
        }
        wr.flush();
        wr.close();
    }
}
