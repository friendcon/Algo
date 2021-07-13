package algo0712;

import javax.swing.*;
import java.io.*;

public class Algo2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = N ; i>=1; i--){
            wr.write(i+ "\n");
        }
        wr.flush();
        wr.close();
    }
}
