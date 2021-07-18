package ch03;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.StringTokenizer;

public class Algo11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer tok;
        for (int i=1; i<=T; i++){
            String str = br.readLine();
            tok = new StringTokenizer(str);
            wr.write("Case #" + i + ": " + (Integer.parseInt(tok.nextToken()) + Integer.parseInt(tok.nextToken()))+"\n");
        }
        wr.flush();
        wr.close();
    }
}
