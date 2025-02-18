package B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] result = new int[26];
        Arrays.fill(result, -1);

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (result[c - 'a'] == -1 ) { // first value fix
                result[c - 'a'] = i;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
