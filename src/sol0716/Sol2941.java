package sol0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String arr[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i=0; i<arr.length; i++) {
            if(str.contains(arr[i])) {
                str = str.replaceAll(arr[i]," ");
            }
        }
        System.out.println(str.length());
    }
}
