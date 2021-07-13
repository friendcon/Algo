package Sol0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sol11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        String NUM = br.readLine();
        for(int i=0; i<N; i++){
            total += Integer.parseInt(NUM.charAt(i)+"");
        }
        System.out.println(total);
    }
}