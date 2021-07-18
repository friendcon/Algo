package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer tok;

        for (int i=0; i<T; i++){
            String str = br.readLine();
            int count = 0;
            tok = new StringTokenizer(str);
            int H = Integer.parseInt(tok.nextToken());
            int W = Integer.parseInt(tok.nextToken());
            int N = Integer.parseInt(tok.nextToken());
            if(N % H == 0){
                System.out.println(H*100+(N/H));
            } else {
                System.out.println((N%H)*100+((N/H)+1));
            }

            // H : 층 W : 호 N : 고객
            /* 내가푼거 ㅠ
            loop1 :
            for (int j=1; j<=W; j++){
                for (int k=1; k<=H; k++){
                    count++;
                    if (count == N){
                        if(j<=9) {
                            System.out.println(k + "0" + j);
                        } else {
                            System.out.println(k+""+j);
                        }
                        break loop1;
                    }
                }
            }*/
        }
    }
}
