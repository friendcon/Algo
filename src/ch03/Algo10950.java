package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Algo10950 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i=0; i<num; i++){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a+b;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
