package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Sol2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int count = 0;
        for(int i=0; i<9; i++){
            int N = Integer.parseInt(br.readLine());
            if(max < N){
                count = i+1;
                max = N;
            }
        }
        wr.write(max+"\n"+count);
        wr.flush();
        wr.close();
    }
}
