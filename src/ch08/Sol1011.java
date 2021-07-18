package ch08;

import java.io.*;

public class Sol1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++){
            String str[] = br.readLine().split(" ");
            int X = Integer.parseInt(str[0]);
            int Y = Integer.parseInt(str[1]);
            int count = 0;
            while (true){
                if(X+1 == Y) break;
                count++;
            }
            System.out.println(count);
        }
//        wr.flush();
//        wr.close();
    }
}
