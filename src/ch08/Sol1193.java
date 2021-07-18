package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N;
        int line = 0;
        int sum = 0;
        int beforeline_sum = 0;
        // 숫자 X가 몇번째 line에 있는지 찾는 반복문
        while (X > sum) {
            line++;
            sum = sum + line;
        }
        // N : 해당 line의 몇번째에 존재하는지?
        for (int i=1; i<line; i++){
            beforeline_sum+=i;
        }

        N = X - beforeline_sum;

        // line이 짝수일 때 : 왼쪽 -> 오른쪽
        // 홀수일 때 : 오른쪽 -> 왼쪽
        if(line%2 == 0){
            System.out.println(N + "/" + (line - N + 1));
        } else if(line%2 == 1){
            System.out.println((line - N + 1) + "/" + N);
        }
    }
}
