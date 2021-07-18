package ch07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int NUM = Integer.parseInt(br.readLine());
        boolean arr[] = new boolean[26];
        int count = NUM;
        for(int i=0; i<NUM; i++) {
            String str = br.readLine();
            // 문자 길이만큼 반복
            for(int j=0; j<str.length()-1; j++) {
                if(str.charAt(j) != str.charAt(j+1)){
                    if(arr[str.charAt(j+1)-97] == true){
                        count--;
                        break;
                    }
                }
                arr[str.charAt(j)-97] = true;
            }
        }
        System.out.println(count);
    }
}
