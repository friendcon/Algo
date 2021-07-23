package ch09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer stz = new StringTokenizer(input);

        int X = Integer.parseInt(stz.nextToken());
        int Y = Integer.parseInt(stz.nextToken());
        int W = Integer.parseInt(stz.nextToken());
        int H = Integer.parseInt(stz.nextToken());

        int arr[] = new int[4];
        arr[0] = X;
        arr[1] = Y;
        arr[2] = H-Y;
        arr[3] = W-X;
        int min = arr[0];

        for (int i=1; i<4; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
