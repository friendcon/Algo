package ch08;

import sun.rmi.runtime.Log;

import java.io.*;
import java.math.BigInteger;

public class Sol10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []arr = br.readLine().split(" ");
        BigInteger A = new BigInteger(arr[0]);
        BigInteger B = new BigInteger(arr[1]);
        System.out.println(A.add(B));
    }
}
