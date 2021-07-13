package Sol0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;

        int N = Integer.parseInt(br.readLine());
        double score[] = new double[N];
        double max = 0;
        double total = 0;
        String str = br.readLine();
        stz = new StringTokenizer(str);

        for (int i=0; i<score.length; i++){
            score[i] = Integer.parseInt(stz.nextToken());
            if(max < score[i]){
                max = score[i];
            }
        }

        for (int i=0; i<score.length; i++){
            double newscore = (score[i]/max)*100;
            total += newscore;
        }
        System.out.println(total/N);
    }
}
