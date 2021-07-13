package algo0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int hour = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[1]);

        if (min >= 0 && min <45) {
            if(hour == 0) {
                hour = 23;
            } else {
                hour = hour - 1;
            }
            min = min + 15;
        } else {
            min = min - 45;
        }

        System.out.println(hour + " " + min);
    }
}
