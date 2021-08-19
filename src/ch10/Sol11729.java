package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol11729 {
    public static void hnoi(int N, int start, int middle, int goal) {
        if(N==1){
            System.out.println(start + " " + goal);
        } else {
            hnoi(N-1, start, goal, middle);
            System.out.println();
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
    }

}
