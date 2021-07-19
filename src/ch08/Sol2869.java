package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Sol2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =  br.readLine();
        StringTokenizer tok = new StringTokenizer(str);
        int A = Integer.parseInt(tok.nextToken());
        int B = Integer.parseInt(tok.nextToken());
        int V = Integer.parseInt(tok.nextToken());
        int day = 0;
        //int count = 0;
        //int total = 0;
        // 반복문은 시간초과.. 시간복잡도 o(1) 로 바꿔야함
        /*
        while (total < V){
            total += A;
            if(total == V) {
                count++;
                break;
            }
            total -= B;
            count++;
        }
        System.out.println(count);
        */
        // 정상에 오르고 나면 미끄러지지 않기 때문에 V-A 후 A-B로 나눔
        // V-A
        day = ((V-A) % (A-B) == 0) ? (V-A) / (A-B) + 1 : (V-A) / (A-B) + 2;
        System.out.println(day);
    }
}
