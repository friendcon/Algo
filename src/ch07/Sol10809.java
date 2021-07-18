package ch07;

import java.io.*;

public class Sol10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count[] = new int[26];
        for(int i=0; i<count.length; i++){
            count[i] = -1;
        }
        for(int i=0 ; i<str.length() ; i++){
            str.charAt(i);
            for (int j=97; j<123; j++){
                if((int)str.charAt(i) == j && count[j-97] == -1){
                    count[j-97] = i;
                }
            }
        }
        for (int k : count){
            System.out.print(k+" ");
        }

    }
}
