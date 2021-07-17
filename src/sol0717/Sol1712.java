package sol0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]); // 고정비용
        int B = Integer.parseInt(str[1]); // 가변비용
        int C = Integer.parseInt(str[2]); // 가격
        int N = 0;

        if(C<=B){
            N=-1;
        } else {
            N=A/(C-B)+1;
        }
        System.out.println(N);
    }
}
