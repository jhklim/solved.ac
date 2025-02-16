package B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] remainders = new int[9];
        int cnt = 0;
        int max = 0;

        for (int i = 0; i < 9; i++) {
            remainders[i] = Integer.parseInt(br.readLine())%42;
            if (remainders[i] > max) {

            }
        }

/*        for (int i = 0; i < 9; i++) {
            if (remainders[i] )
        }*/
    }
}
