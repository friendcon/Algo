package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok;
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String str = br.readLine();
            tok = new StringTokenizer(str);
            int SNUM = Integer.parseInt(tok.nextToken());
            int arr[] = new int[SNUM];
            double total = 0;
            int overscore = 0;
            for (int j=0; j<SNUM; j++){
                arr[j] = Integer.parseInt(tok.nextToken());
                total += arr[j];
            }
            double avg = total/SNUM;
            for (int score : arr){
                if(score > avg){
                    overscore++;
                }
            }
            double result = (double) overscore/SNUM;
            double percent = result*100;
            System.out.println(String.format("%.3f", percent)+"%");
        }
    }
}
