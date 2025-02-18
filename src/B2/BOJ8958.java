package B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ8958 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String S = br.readLine();
            int sum = 0;
            int count = 0;

            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == 'O') {
                   count++;
                   sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
