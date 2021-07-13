package Sol0713;

import java.io.*;

public class Sol3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean []bool = new boolean[42];
        int count = 0;
        for(int i=0; i<10; i++){
            int N = Integer.parseInt(br.readLine());
            bool[N%42] = true;
        }

        for(boolean B : bool){
            if(B == true){
                count++;
            }
        }
        System.out.println(count);
    }
}
