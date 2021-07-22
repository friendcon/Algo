package ch09;

import java.io.*;

/*
    에라토스테네스의 체 알고리즘
    - 소수를 판별하는 알고리즘
    - 이전에 소수 판별하는 문제의 시간복잡도는 O(n)
    - 1은 소수가 아니기 때문에 제거
    - 2부터 시작해서 특정 배수에 해당하는 숫자를 제거
    - 제거하고 남아있는 수가 소수

 */
public class Sol1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int M = Integer.parseInt(arr[0]);
        int N = Integer.parseInt(arr[1]);
        boolean prime[] = new boolean[N+1];

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= N; i++) {
            // 제곱근 만큼 검사
            // 시간복잡도 O(루트 N)
            for (int j = 2; j * i <= N; j++) {
                prime[j * i] = true;
            }
        }

        for (int i=M; i<=N; i++){
            if(prime[i] == false){
                wr.write(i+"\n");
            }
        }
        wr.flush();
        wr.close();
    }
}
