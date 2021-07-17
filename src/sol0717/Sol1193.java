package sol0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = 0;
        int line = 1;
        int sum = 0;
        int beforeline_sum = 0;
        // 숫자 X가 몇번째 line에 있는지 찾는 반복문
        while (true) {
            sum = sum + line;
            if(X > sum) break; // X는 line의 합보다 작아야함
            line++;
        }
        // N : 해당 line의 몇번째에 존재하나
        for (int i=1; i<line; i++){
            beforeline_sum+=i;
        }
        N = sum - beforeline_sum;

        // line이 짝수일 때 : 왼쪽 -> 오른쪽
        // 홀수일 때 : 오른쪽 -> 왼쪽
        if(line%2 == 0){
            int top = N;
            int bottom = line - N - 1;
            System.out.println(top + "/" + bottom);
        } else if(line%2 == 1){
            int top = line - N + 1;
            int bottom = N;
            System.out.println(top + "/" + bottom);
        }

    }
}
