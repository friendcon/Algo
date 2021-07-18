package ch03;

import java.io.*;
import java.util.StringTokenizer;

public class Algo10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String NX = br.readLine();
        StringTokenizer tok = new StringTokenizer(NX);

        int N = Integer.parseInt(tok.nextToken());
        int X = Integer.parseInt(tok.nextToken());

        String A = br.readLine();
        tok = new StringTokenizer(A);
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(tok.nextToken());
        }

        for(int i=0; i<N; i++){
            if(arr[i] < X){
                wr.write(arr[i] + " ");
            }
        }
        wr.flush();
        wr.close();
    }
}
