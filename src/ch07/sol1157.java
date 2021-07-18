package ch07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class sol1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        int arr[] = new int[26];
        int max = 0;
        int index = 0;
        for(int i=0; i<input.length() ; i++){
            arr[input.charAt(i) - 'A']++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            } else if (arr[i] == max) {
                index = -1;
            }
        }
        if(index == -1){
            System.out.println("?");
        } else {
            System.out.println((char)(index + 65));
        }
    }
}
