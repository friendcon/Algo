package ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
    소수 구하기 문제
    소수 : 나눠떨어지는 수가 1과 자기자신일 경우
    1일경우 소수 X
 */

public class Sol1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        int arr[] = new int[N];
        String []str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            int count = 0;
            arr[i] = Integer.parseInt(str[i]);
            if(arr[i] == 1) continue;
            for (int j=1; j<=arr[i]; j++){
                if(arr[i] % j == 0) count++;
            }
            if(count == 2) {
                total++;
            }
        }
        System.out.println(total);
    }
}
