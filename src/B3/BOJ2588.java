package B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2588 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        int sum = 0;
        for (int i = B.length() - 1; i >= 0; i--) {
            int n = B.charAt(i) - '0';
            System.out.println(n*A);
            sum += n * A * (int)Math.pow(10, B.length()-1-i);
        }
        System.out.println(sum);
    }
}
