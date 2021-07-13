package Sol0713;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int total = 0;
        int cnt = 0;
        for (int i=0; i<T; i++) {
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == 'O'){
                    cnt++;
                    total += cnt;
                } else if(str.charAt(j) == 'X'){
                    cnt = 0;
                }
            }
            System.out.println(total);
            total = 0;
            cnt = 0;
        }
    }
}
