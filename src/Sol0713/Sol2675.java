package Sol0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok;
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String str = br.readLine();
            tok = new StringTokenizer(str);
            int rep = Integer.parseInt(tok.nextToken());
            String word = tok.nextToken();
            int originlength = word.length();
            String newword = "";
            for (int j=0; j<originlength; j++){
                for (int k=0; k<rep; k++){
                    newword += word.charAt(j);
                }
            }
            System.out.println(newword);
        }
    }
}
