package ch05;

import java.io.*;

public class Sol2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int arr[] = {0,0,0,0,0,0,0,0,0,0};
        String result = A*B*C + "";

        for(int i=0; i<result.length(); i++){
            for(int j=0; j<10; j++){
                if(Integer.parseInt(result.charAt(i)+"") == j) {
                    arr[j]++;
                }
            }
        }
        for (int k : arr){
            wr.write(k+"\n");
        }
        wr.flush();
        wr.close();
    }
}
