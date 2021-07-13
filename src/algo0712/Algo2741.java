package algo0712;

import java.io.*;

public class Algo2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i<=N; i++){
            wr.write(i + "\n");
        }
        wr.flush();
    }
}
