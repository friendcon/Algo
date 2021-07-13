package algo0712;

import java.io.*;

public class Algo2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
            for (int j=0; j<=i; j++){
                wr.write("*");
            }
            wr.newLine();
        }
        wr.flush();
        wr.close();
    }
}
