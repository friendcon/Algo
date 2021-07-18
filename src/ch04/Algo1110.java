package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int newNum = (N%10)*10 + (((N/10) + (N%10)) % 10);
        int count = 1;

        while (N != newNum){
            newNum = (newNum%10)*10 + (((newNum/10) + (newNum%10)) % 10);
            count++;
        }
        System.out.println(count);
    }
}
