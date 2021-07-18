package ch07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 아무것도 입력 안했을 때 처리 안해줘서 틀린듯..
        //String []str = br.readLine().trim().split(" ");
        //System.out.println(str.length);
        String str = br.readLine().trim();
        if(str.isEmpty()){
            System.out.println(0);
        } else {
            String arr[] = str.split(" ");
            System.out.println(arr.length);
        }

    }
}
