package B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String data = Integer.toString(result);

        int[] array = new int[10];

        for (int i = 0; i < data.length(); i++) {
            array[data.charAt(i) - '0'] += 1;
        }

        for (int val : array) {
            System.out.println(val);
        }
    }
}
