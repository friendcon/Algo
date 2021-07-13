package Sol0713;

import java.io.IOException;

public class Sol15596 {
    public static long sum(int[] a) {
        long total = 0;
        for (int i=0; i<a.length; i++){
            total+=a[i];
        }
        return total;
    }
    public static void main(String[] args) throws IOException {
        int a[] = {1,2,3,4,5};
        sum(a);
    }
}
