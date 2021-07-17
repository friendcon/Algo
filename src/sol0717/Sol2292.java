package sol0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 1;
        int count = 1;
        // 벌집1이 아닐 때
        if(N!=1){
            // 반복
            while (true) {
                if(N <= max){
                    break;
                }
                max = max + (count)*6; // count에 존재하는 최대값
                count++;
            }
        }
        System.out.println(count);
    }
}
