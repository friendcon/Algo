package ch11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol2798 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]); // 카드갯수
        int S = Integer.parseInt(arr[1]); // 합

        String arr2 = br.readLine();
        int min = 0; // 차이가 적은것
        int result = 0;
        int num[] = new int[N];
        StringTokenizer stz = new StringTokenizer(arr2);

        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(stz.nextToken()); // arr[0] 개의 숫자 정수로 변환
        }

        // 완전탐색 필요
        loop:
        for(int i=0; i<N - 2; i++){
            for(int j=i+1; j<N - 1; j++){
                for(int k=j+1; k<N; k++){
                    int sum = num[i] + num[j] + num[k];
                    if(sum == S) {
                        result = sum;
                        break loop;// 두 수가 일치하면 종료
                    }
                    if(sum < S && result < sum){
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
